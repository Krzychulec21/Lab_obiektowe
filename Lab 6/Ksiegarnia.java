package pl.krzychulecjava;

public class Ksiegarnia {
    boolean czyOtwarta;

    public Ksiegarnia(boolean czyOtwarta) {
        this.czyOtwarta = czyOtwarta;
    }
    public void sklep(){
        if(this.czyOtwarta==true)
            System.out.println("ksiegarnia jest otwarta");
       else System.out.println("ksiegarnia zamknieta");
    }
}
