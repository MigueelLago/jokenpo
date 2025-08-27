import domain.Move;
import domain.Outcome;
import game.Referee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RefereeTest {

    @Test
    void rockBeatsScissors() {
        Referee r = new Referee();
        assertEquals(Outcome.PLAYER1_WIN, r.decide(Move.PEDRA, Move.TESOURA));
    }

    @Test
    void paperBeatsRock() {
        Referee r = new Referee();
        assertEquals(Outcome.PLAYER1_WIN, r.decide(Move.PAPEL, Move.PEDRA));
    }

    @Test
    void scissorsBeatsPaper() {
        Referee r = new Referee();
        assertEquals(Outcome.PLAYER1_WIN, r.decide(Move.TESOURA, Move.PAPEL));
    }

    @Test
    void drawSameMove() {
        Referee r = new Referee();
        assertEquals(Outcome.DRAW, r.decide(Move.PEDRA, Move.PEDRA));
        assertEquals(Outcome.DRAW, r.decide(Move.PAPEL, Move.PAPEL));
        assertEquals(Outcome.DRAW, r.decide(Move.TESOURA, Move.TESOURA));
    }

    @Test
    void player2Wins() {
        Referee r = new Referee();
        assertEquals(Outcome.PLAYER2_WIN, r.decide(Move.TESOURA, Move.PEDRA));
        assertEquals(Outcome.PLAYER2_WIN, r.decide(Move.PEDRA, Move.PAPEL));
        assertEquals(Outcome.PLAYER2_WIN, r.decide(Move.PAPEL, Move.TESOURA));
    }
}
