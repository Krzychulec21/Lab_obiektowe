package pl.krzychulecjava;

import java.sql.SQLOutput;

public class Ksiazka {
    String autor,wydawnictwo;
    int rokWydania;

    public Ksiazka(String autor, String wydawnictwo, int rokWydania) {
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.rokWydania = rokWydania;
    }
    public void opis(){
        System.out.print("Autor: "+this.autor+", wydawnictwo: "+this.wydawnictwo+", rok wydania: "+this.rokWydania);
    }
}
