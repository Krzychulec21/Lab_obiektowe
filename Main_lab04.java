package pl.krzychulecjava;

import java.util.Scanner;

public class Main_lab04 {

    public static void main(String[] args) {
        wariancja();

    }
    public static void tab_for(){                   //zad1
        Scanner in = new Scanner(System.in);
        System.out.println("podaj liczbe elementow tablicy: ");
        int n = in.nextInt();
        int tab[] = new int[n];
        double suma=0, srednia=0;
        System.out.println("Podaj elementy tablicy: ");
        for (int i=0;i<n;i++){
            tab[i]=in.nextInt();
            suma+=tab[i];

        }
        srednia=suma/n;
        System.out.println("suma: "+suma+"\n"+"srednia: "+srednia );
    }
    public static void tab_foreach(){               //zad1
        Scanner in = new Scanner(System.in);
        System.out.println("podaj liczbe elementow tablicy: ");
        int n = in.nextInt();
        int tab[] = new int[n];
        double suma=0, srednia=0;
        System.out.println("Podaj elementy tablicy: ");
        for(int i : tab) {
            i = in.nextInt();
            suma+=i;
        }
        srednia=suma/n;
        System.out.println("suma: "+suma+"\n"+"srednia: "+srednia );
    }
    public static void zad2(){
        boolean[] tablica = new boolean [20];
        for(int i = 0; i< tablica.length; i++){
            if(i%2==0){
                tablica[i] = true;
                System.out.println("Tablica nr "+ i + ": " + tablica [i]);
            }
            else{
                tablica[i] = false;
                System.out.println("Tablica nr "+ i + ": " + tablica [i]);
            }
        }
    }
    public static void wariancja(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe pomiarow");
        int n =in.nextInt();
        double tab[] = new double[n];
        double srednia = 0,suma=0;
        System.out.println("Podaj kolejno pomiary: ");
        for(int i=0;i<n;i++){
            tab[i]= in.nextDouble();
            suma+=tab[i];
        }
        srednia=suma/n;
        double licznik=0;
        for( int i=0; i<n; i++){
            licznik+=(tab[i]-srednia)*(tab[i]-srednia);
        }
        double wariancja=licznik/(n-1);
        System.out.println("Wariancja: "+wariancja);
    }
}
