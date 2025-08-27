package players;

import domain.Move;

public interface Player {
    String name();
    Move nextMove();
}
