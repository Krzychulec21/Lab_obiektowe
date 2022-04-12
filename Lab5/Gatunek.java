package pl.krzychulecjava;

public class Gatunek {
    String nazwaGatunkowa;
    String nazwaRodzaju;
    int chromosomy2n;
    int chromosomyX;
    String opis;

    public Gatunek(String nazwaGatunkowa, String nazwaRodzaju, int chromosomy2n, int chromosomyX, String opis) {
        this.nazwaGatunkowa = nazwaGatunkowa;
        this.nazwaRodzaju = nazwaRodzaju;
        this.chromosomy2n = chromosomy2n;
        this.chromosomyX = chromosomyX;
        this.opis = opis;
    }
    void pelnaNazwa(){
        System.out.println("Rodzaj: "+nazwaRodzaju+" gatunek: "+nazwaGatunkowa);
    }
    void getChromosomN(){
        System.out.println(" haploidalna liczba chromosomów n: "+chromosomy2n);
    }
    void allInfo(){
        System.out.println("Nazwa gatunkowa: "+nazwaGatunkowa+", nazwa rodzaju: "+nazwaRodzaju+", ilosc chromosomow 2n: "+chromosomy2n
        +", liczba chromosomow x: "+chromosomyX+", krótki opis: "+opis);
    }
    public Gatunek kopiujObiekt(){
        return this;
    }
}
