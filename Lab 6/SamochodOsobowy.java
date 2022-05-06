package pl.krzychulecjava;

import java.util.Scanner;

public class SamochodOsobowy extends Samochod {
    double waga,pojemnosc,iloscOsob;

    public SamochodOsobowy() {
        super();
        System.out.println("Podaj wage samochodu w tonach: ");
        do {
            this.waga = scan.nextDouble();
        }while(waga< 2 || waga > 4.5);
        System.out.println("Podaj pojemnosc samochodu ( od 0.8 - 3.0) : ");
        do {
            this.pojemnosc = scan.nextDouble();
        }while(pojemnosc<0.8 || pojemnosc>3.0);
        System.out.println("Podaj ilosc dostepnych miejsc: ");
        this.iloscOsob = scan.nextDouble();
    }
    public void opis(){
        super.opis();
        System.out.println("waga w tonach: "+this.waga+", pojemnosc: "+this.pojemnosc+". ilosc miejsc: "+iloscOsob);
    }

}
