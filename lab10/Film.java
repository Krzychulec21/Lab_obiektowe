package com.company;

public class Film {
    private int czasTrwania;
    private String tytul;
    private boolean czyObejrzany;

    public Film(int czasTrwania, String tytul, boolean czyObejrzany) {
        this.czasTrwania = czasTrwania;
        this.tytul = tytul;
        this.czyObejrzany = czyObejrzany;
    }

    public int getCzasTrwania() {
        return czasTrwania;
    }

    public void setCzasTrwania(int czasTrwania) {
        this.czasTrwania = czasTrwania;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public boolean isCzyObejrzany() {
        return czyObejrzany;
    }

    public void setCzyObejrzany(boolean czyObejrzany) {
        this.czyObejrzany = czyObejrzany;
    }

    @Override
    public String toString() {
        return "Film{" +
                "czasTrwania=" + czasTrwania +
                ", tytul='" + tytul + '\'' +
                ", czyObejrzany=" + czyObejrzany +
                '}';
    }
}
