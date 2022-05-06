package pl.krzychulecjava;

public class Powiesc extends Ksiazka{
    String gatunek;

    public Powiesc(String autor, String wydawnictwo, int rokWydania, String gatunek) {
        super(autor, wydawnictwo, rokWydania);
        this.gatunek = gatunek;
    }

    @Override
    public void opis() {
        System.out.println("\n");
        super.opis();
        System.out.print(", gatunek: "+this.gatunek+"\n");
    }
}
