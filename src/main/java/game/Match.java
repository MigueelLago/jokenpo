package game;

import domain.Move;
import domain.Outcome;
import players.Player;

public class Match {

    private final Player player1;
    private final Player player2;
    private final Referee referee;
    private int player1Score;
    private int player2Score;
    private int draws;


    // Constructor
    public Match(Player player1, Player player2, Referee referee) {
        this.player1 = player1;
        this.player2 = player2;
        this.referee = referee;
    }

    public void playRounds(int rounds) {
        for (int i = 1; i <= rounds; i++) {
            Move move1 = player1.nextMove();
            Move move2 = player2.nextMove();
            Outcome outcome = referee.decide(move1, move2);

            switch (outcome) {
                case PLAYER1_WIN -> player1Score++;
                case PLAYER2_WIN -> player2Score++;
                case DRAW -> draws++;
            }

            System.out.println("Rodada " + i + ": " + player1.name() + " " + move1 + " x " + move2 + " " + player2.name() + " => " + outcome);
        }

        System.out.println("Placar: " + player1.name() + " " + player1Score + " x " + player2Score + " " + player2.name() + " (empates " + draws + ")");

        if (player1Score > player2Score) System.out.println("Vencedor: " + player1.name());
        else if (player2Score > player1Score) System.out.println("Vencedor: " + player2.name());
        else System.out.println("Empate geral!");
    }
}
