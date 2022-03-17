package pl.krzychulecjava;

import java.util.Scanner;




public class Main_lab01 {

    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);

       /* String imie = in.next();  //zad1
        int wiek=in.nextInt();
        wypisanie(wiek,imie);*/

       /* double a=in.nextDouble();   //zad2
        double b=in.nextDouble();
        wyniki(a,b);*/

       // System.out.println(parzysta(6));    //zad3

        /*int x;                                  //zad4
        x=in.nextInt();
        System.out.println(podzielna35(x));*/

        /*System.out.println("potegowanie liczby. podaj liczbe a pozniej potege do ktorej chcesz podniesc ją.");  //zad5
        double a=in.nextDouble();
        double b=in.nextDouble();
        System.out.println(potega(a,b));*/

        /*System.out.println("obliczanie pierwiastka kwadratowego. podaj liczbe: ");  //zad6
        double a=in.nextDouble();
        System.out.println(pierwiastek(a));*/

      /* System.out.println("wprowadz przedzial z ktorych maja byc wylosowane boki: ");  //zad7
        Random rand = new Random();
        double a=in.nextDouble();
        double b=in.nextDouble();
        double bok1 = rand.nextDouble() * (b - a) + a;
        double bok2 = rand.nextDouble() * (b - a) + a;
        double bok3 = rand.nextDouble() * (b - a) + a;
        System.out.println("bok1: " +bok1+" bok2: "+bok2+ " bok3: "+bok3);
        System.out.println(trojkat(bok1,bok2,bok3));*/






    }

    public static void wypisanie(int wiek, String imie) {       //zad1
        System.out.println("twoje imie: " + imie + " twój wiek: " + wiek);
    }

    public static void wyniki(double a, double b) {         //zad2
        double suma = a + b;
        double roznica = a - b;
        double iloczyn = a * b;
        System.out.println("suma= " + suma + "\n" + "roznica= " + roznica + "\n" + "iloczyn= " + iloczyn);
    }

  public static boolean parzysta(int liczba){   //zad3
        if(liczba%2==0)
            return true;
        else return false;
  }
    public static boolean podzielna35(int x){       //zad4
        if(x%3==0 && x%5==0)
            return true;
        else return false;
    }
    public static double potega(double a, double b){    //zad5
        return Math.pow(a,b);
    }
    public static double pierwiastek(double a){         //zad6
        return Math.sqrt(a);
    }
    public static boolean trojkat(double bok1,double bok2,double bok3){     //zad7
        if(bok1*bok1+bok2*bok2==bok3*bok3 || bok1*bok1+bok3*bok3==bok2*bok2 || bok2*bok2+bok3*bok3==bok1*bok1)
            return true;
        else return false;
    }
}
