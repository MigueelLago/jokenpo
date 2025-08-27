import domain.Move;
import domain.Outcome;
import game.Referee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RefereeTest {

    @Test
    void rockBeatsScissors() {
        Referee r = new Referee();
        assertEquals(Outcome.PLAYER1_WIN, r.decide(Move.ROCK, Move.SCISSORS));
    }

    @Test
    void paperBeatsRock() {
        Referee r = new Referee();
        assertEquals(Outcome.PLAYER1_WIN, r.decide(Move.PAPER, Move.ROCK));
    }

    @Test
    void scissorsBeatsPaper() {
        Referee r = new Referee();
        assertEquals(Outcome.PLAYER1_WIN, r.decide(Move.SCISSORS, Move.PAPER));
    }

    @Test
    void drawSameMove() {
        Referee r = new Referee();
        assertEquals(Outcome.DRAW, r.decide(Move.ROCK, Move.ROCK));
        assertEquals(Outcome.DRAW, r.decide(Move.PAPER, Move.PAPER));
        assertEquals(Outcome.DRAW, r.decide(Move.SCISSORS, Move.SCISSORS));
    }

    @Test
    void player2Wins() {
        Referee r = new Referee();
        assertEquals(Outcome.PLAYER2_WIN, r.decide(Move.SCISSORS, Move.ROCK));
        assertEquals(Outcome.PLAYER2_WIN, r.decide(Move.ROCK, Move.PAPER));
        assertEquals(Outcome.PLAYER2_WIN, r.decide(Move.PAPER, Move.SCISSORS));
    }
}
