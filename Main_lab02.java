package pl.krzychulecjava;

import java.util.Scanner;

public class Main_lab02 {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    /*System.out.println("Podaj współczynnik a: ");
    double a=in.nextDouble();
    System.out.println("Podaj współczynnik a: ");   // zad 1
    double b=in.nextDouble();
    System.out.println("Podaj współczynnik a: ");
    double c=in.nextDouble();
    kwadratowa(a,b,c); */

        /* double a=0,b=-65,c=40;    // zad 3
        kolejnosc(a,b,c); */

        /* int pyt1, pyt2;
        System.out.println("Czy obecnie pada deszcz? ( Jeśli tak to wpisz '1', w przeciwnym razie wpisz '0') ");    //zad 4
        pyt1=in.nextInt();
        System.out.println("Czy autobus jest na przystanku? ( Jeśli tak to wpisz '1', w przeciwnym razie wpisz '0') ");
        pyt2=in.nextInt();
        deszcz_aut(pyt1,pyt2); */

        /*System.out.println("Czy jest znizka na samochod? ( Jeśli tak to wpisz '1', w przeciwnym razie wpisz '0') ");  //zad 5
        int pyt1=in.nextInt();
        System.out.println("Czy otrzymales podwyzke? ( Jeśli tak to wpisz '1', w przeciwnym razie wpisz '0') ");
        int pyt2=in.nextInt();
        auto(pyt1,pyt2);*/              //gdy jest przypadek 0,1 wypisza sie wszystkie 3 opcje i odpowiedzi sie gryzą

        System.out.println("podaj dzialanie jakie chcesz wykonac ( 1-dodawanie, 2-odejmowanie, 3-mnozenie, 4-dzielenie, 5-resza z dzielenia");  //zad6
        int opcja= in.nextInt();
        System.out.println("podak kolejno dwie liczby: ");
        double a=in.nextDouble();
        double b=in.nextDouble();
        kalkulator(a,b,opcja);



    }
    public static void kwadratowa(double a, double b, double c){ //zad1
        if(a!=0){
            double delta = b*b-4*a*c;
            double pwd = Math.sqrt(delta);
            if(delta<0)
                System.out.println("brak rozwiązań równania");
            if(delta==0)
                System.out.println("miejsce zerowe x0: "+(-b/2*a));
            if(delta>0)
                System.out.println("miejsce zerowe x1: "+((-b+pwd)/2*a)+" x2: "+((-b-pwd)/2*a));
        }
        else System.out.println("nie jest to rownanie kwadratowe ( współczynnik a=0 )");
    }
    public static double a(double x){   //zad 2
        if(x>0) return 2*x;
        if(x==0) return 0;
        else return -3*x;
    }
    public static double b(double x){
        if(x>=1) return x*x;
        else return x;
    }
    public static double c(double x){
        if(x>2) return 2+x;
        if(x==2) return 8;
        else return x-4;
    }
    public static void kolejnosc(double a,double b,double c){           //zad 3
        if(a>=b&&a>=c&&b>=c) System.out.println(c+" "+b+" "+a);
        else if(a>=b&&a>=c&&b<=c) System.out.println(b+" "+c+" "+a);
        else if(a<=b&&a<=c&&b<=c) System.out.println(a+" "+b+" "+c);
        else if(a<=b&&a<=c&&b>=c) System.out.println(a+" "+c+" "+b);
        else if(a>=b&&a<=c&&b<=c) System.out.println(b+" "+a+" "+c);
        else if(a<=b&&b>=c&&b>=c) System.out.println(c+" "+a+" "+b);
    }
    public static void deszcz_aut(int pyt1, int pyt2){                                              //zad 4
        if(pyt1==1 && pyt2==1) System.out.println("Weź parasol, dostaniesz się na uczelnię");
        if(pyt1==1 && pyt2!=1) System.out.println("Nie dostaniesz się na uczelnię (sadge)");
        if(pyt1!=1 && pyt2==1) System.out.println("Dostaniesz się na uczelnię, miłego dnia i pięknej pogody");
    }
    public static void auto(int pyt1,int pyt2){ //zad 5
        if(pyt1!=1 || pyt2==1)
            System.out.println("Możesz kupić samochód !”,„Zniżki na samochód nie ma");
        if(pyt1!=1 || pyt2!=1)
            System.out.println("Zakup samochód trzebaodłożyć na później..., Zniżki na samochód nie ma");
        if(pyt1==1 || pyt2==1)
            System.out.println("Możesz kupić samochód ");
    }
    public static void kalkulator(double a,double b,int opcja){ //zad 6
        switch (opcja) {
            case 1 -> System.out.println(a + " + " + b + " = " + (a + b));
            case 2 -> System.out.println(a + " - " + b + " = " + (a - b));
            case 3 -> System.out.println(a + " * " + b + " = " + (a * b));
            case 4 -> System.out.println(a + " / " + b + " = " + (a / b));
            case 5 -> System.out.println(a + " % " + b + " = " + (a % b));
            default -> System.out.println("nie ma takiej operacji, wpisz poprawny numer z zakresu 1-5");
        }
    }
}
