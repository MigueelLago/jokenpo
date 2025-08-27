package domain;

public enum Move {
    PEDRA, PAPEL, TESOURA;

    public boolean beats(Move other) {
        return (this == PEDRA && other == TESOURA) ||
               (this == PAPEL && other == PEDRA) ||
               (this == TESOURA && other == PAPEL);
    }
}
