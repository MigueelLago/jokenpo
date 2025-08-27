package domain;

public enum Outcome {

    PLAYER1_WIN, PLAYER2_WIN, DRAW;

    public String toString() {
        return switch (this) {
            case PLAYER1_WIN -> "Player 1 venceu!";
            case PLAYER2_WIN -> "Player 2 venceu!";
            case DRAW -> "Empate!";
        };
    }
}
