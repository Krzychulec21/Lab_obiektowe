package pl.krzychulecjava;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

    /*Prostokat object1 = new Prostokat(3,4);       //zad1
    object1.pole();
    object1.obwod();
    object1.przekatna();*/

        /*Budynek object1 = new Budynek(LocalDate.parse("2011-11-05"),"Kino",4);        //zad2
     object1.info();*/

    Gatunek kwiatek1 = new Gatunek("Gatunek 1","Rodzaj 1",23,12,"Krótki opis i te sprawy");
    kwiatek1.allInfo();
    kwiatek1.getChromosomN();
    kwiatek1.pelnaNazwa();
    Gatunek kwatek2 = kwiatek1.kopiujObiekt();
    kwatek2.allInfo();
    kwiatek1.allInfo();




    }
}
