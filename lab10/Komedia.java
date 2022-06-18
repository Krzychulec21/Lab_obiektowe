package com.company;

public class Komedia extends Film {

    public Komedia(int czasTrwania, String tytul, boolean czyObejrzany) {
        super(czasTrwania, tytul, czyObejrzany);

    }
    private final String typ = "komedia";

    @Override
    public String toString() {
        return super.toString()+" - "+typ;
    }
}
