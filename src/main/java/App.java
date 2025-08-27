import game.Match;
import game.Referee;
import players.HumanPlayer;
import players.Player;
import players.RandomBot;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new HumanPlayer("Você ", scanner);
        Player player2 = new RandomBot("Bot");

        Referee referee = new Referee();
        Match match = new Match(player1, player2, referee);
        int roundsInt;

        do {
            System.out.print("Informe o número de partidas que você deseja jogar: ");
            String rounds = scanner.nextLine().trim();
            roundsInt = numberOfRounds(rounds);
        } while (roundsInt == 0);

        match.playRounds(roundsInt);
    }

    public static int numberOfRounds(String input) {
        try {
            int rounds = Integer.parseInt(input.trim());
            if (rounds <= 0) {
                System.out.println("Número inválido de partidas. Informe um número de partidas maior que zero.");
                return 0;
            }
            return rounds;
        } catch (NumberFormatException e) {
            System.out.println ("Entrada inválida. Por favor, insira um número inteiro válido.");
        }
        return 0;
    }
}
