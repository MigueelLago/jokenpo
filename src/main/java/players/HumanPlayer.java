package players;

import domain.Move;

import java.util.Locale;
import java.util.Scanner;

public class HumanPlayer implements Player {

    private final String name;
    private final Scanner scanner;

    // Constructor
    public HumanPlayer(String name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Move nextMove() {
        System.out.print("Escolha sua jogada ([R] para Pedra, [P] para Papel ou [T] para tesoura): ");
        String value = scanner.nextLine().trim().toLowerCase(Locale.ROOT);
        return switch (value) {
            case "r", "pedra" -> Move.ROCK;
            case "p", "papel" -> Move.PAPER;
            case "t", "tesoura" -> Move.SCISSORS;
            default -> nextMove();
        };
    }

}
