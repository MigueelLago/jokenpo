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
        System.out.print("Escolha sua jogada ([r] para Pedra, [p] para Papel ou [t] para tesoura): ");
        String value = scanner.nextLine().trim().toLowerCase(Locale.ROOT);
        return switch (value) {
            case "r", "pedra" -> Move.PEDRA;
            case "p", "papel" -> Move.PAPEL;
            case "t", "tesoura" -> Move.TESOURA;
            default -> nextMove();
        };
    }

}
