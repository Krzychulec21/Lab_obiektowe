package com.company;

public class Horror extends Film {
    public Horror(int czasTrwania, String tytul, boolean czyObejrzany) {
        super(czasTrwania, tytul, czyObejrzany);
    }
    private final String typ = "horror";

    @Override
    public String toString() {
        return super.toString()+" - "+typ;
    }
}
