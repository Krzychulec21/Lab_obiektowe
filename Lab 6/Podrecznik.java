package pl.krzychulecjava;

public class Podrecznik extends Ksiazka {
    String przedmiot;

    public Podrecznik(String autor, String wydawnictwo, int rokWydania, String przedmiot) {
        super(autor, wydawnictwo, rokWydania);
        this.przedmiot = przedmiot;
    }

    @Override
    public void opis() {
        System.out.println("\n");
        super.opis();
        System.out.print(", przedmiot: "+this.przedmiot+"\n");
    }
}
