package players;

import domain.Move;

import java.util.Random;

public class RandomBot implements Player {
    private final String name;
    private final Random random;

    // Constructor
    public RandomBot(String name) {
        this.name = name;
        this.random = new Random();
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Move nextMove() {
        int i = random.nextInt(3);
        return Move.values()[i];
    }
}
