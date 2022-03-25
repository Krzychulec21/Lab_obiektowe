package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main_lab03 {

    public static void main(String[] args) {

    }

    public static double wczytaj() {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        return n;
    }

    public static void zad1() {
        System.out.println("Podaj liczbe studentow: ");
        double ls = wczytaj();
        double suma = 0, srednia = 0, temp = ls;
        while (ls > 0) {
            System.out.println("liczba punktow z testu: ");
            double w = wczytaj();
            if (w >= 0 && w <= 50) {
                suma += w;
                ls--;
            }
            continue;
        }
        srednia = suma / temp;
        System.out.println("srednia punktow z testow " + temp + " studentow wynosi:" + srednia);
    }

    public static void zad2() {
        System.out.println("podaj 10 liczb.");
        double liczba, suma_u = 0, suma_d = 0;
        int l_d = 0, l_u = 0, i;
        for (i = 0; i < 10; i++) {
            liczba = wczytaj();
            if (liczba >= 0) {
                l_d++;
                suma_d += liczba;
            } else {
                l_u++;
                suma_u += liczba;
            }
        }
        System.out.println("suma liczb dodatnich: " + suma_d + ", ilosc liczb dodatnich: " + l_d);
        System.out.println("suma liczb ujemnych: " + suma_u + ", ilosc liczb ujemnych: " + l_u);
    }

    public static void zad3() {
        double suma = 0, liczba;
        int n;
        System.out.println("podaj liczbe elementow ciagu: ");
        n = (int) wczytaj();
        for (int i = 0; i < n; i++) {
            liczba = wczytaj();
            if (liczba % 2 == 0)
                suma += liczba;
        }
        System.out.println("suma: " + suma);
    }

    public static void zad4() {
        Random rand = new Random();
        double suma = 0, n;
        int liczba;
        System.out.println("podaj liczbe elementow ciagu: ");
        n = wczytaj();
        for (int i = 0; i < n; i++) {
            liczba = rand.nextInt(56)-10;
            if (liczba % 2 == 0)
                suma += liczba;
        }
        System.out.println("suma: " + suma);
    }
    public static boolean Palindrom(String tekst){
        for (int i=0; i<tekst.length()/2;i++){
            char znak = tekst.charAt(i);
            char przeciwnyZnak = tekst.charAt(tekst.length()-1 -i);

            if(znak !=przeciwnyZnak) return false;
        }
        return true;
    }
    public static boolean Palindrom(long liczba){
        return Palindrom(Long.toString(liczba));
    }

}
