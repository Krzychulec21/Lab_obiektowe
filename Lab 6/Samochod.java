package pl.krzychulecjava;

import java.util.Scanner;

public class Samochod {
    String marka, model, nadwozie, kolor;
    double przebieg, rokProdukcji;
    Scanner scan = new Scanner(System.in);

    public Samochod(String marka, String model, String nadwozie, String kolor, double przebieg, double rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        if(przebieg<0) {
            this.przebieg = 0;
        }else this.przebieg = przebieg;
        this.rokProdukcji = rokProdukcji;
    }
    public Samochod() {
        System.out.println("Podaj marke samochodu: ");
        this.marka = scan.nextLine();
        System.out.println("Podaj model samochodu: ");
        this.model = scan.nextLine();
        System.out.println("Podaj rodzaj nadwozia: ");
        this.nadwozie = scan.nextLine();
        System.out.println("Podaj kolor samochodu: ");
        this.kolor = scan.nextLine();
        System.out.println("Podaj przebieg: ");
       do {
           this.przebieg = scan.nextDouble();
       }while(this.przebieg<0);
        System.out.println("Podaj rok produkcji: ");
        this.rokProdukcji = scan.nextDouble();
    }
    public void opis(){
        System.out.println("Marka samochodu: "+ this.marka+", model: "+this.model+", rodzaj nadwozia: "+this.nadwozie+", kolor: "+this.kolor+
                ", przebieg: "+this.przebieg+", rok produkcji: "+this.rokProdukcji);
    }
}

