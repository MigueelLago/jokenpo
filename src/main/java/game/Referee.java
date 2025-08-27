package game;

import domain.Move;
import domain.Outcome;

public class Referee {

    public Outcome decide(Move player1, Move player2)
    {
        if (player1 == player2) return Outcome.DRAW;

        return player1.beats(player2) ? Outcome.PLAYER1_WIN : Outcome.PLAYER2_WIN;
    }

}
