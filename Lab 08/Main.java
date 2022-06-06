package pl.krzychulecjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NieprawidlowyAdresException {
        /*Scanner scanner = new Scanner(System.in);
       try {
           double a = scanner.nextDouble();
           if (a<0){
               throw new IllegalArgumentException("Liczba musi byc nieujemna");
           }
           else{
               System.out.println(Math.sqrt(a));
           }
       }
       catch (InputMismatchException e){
         System.err.println("Musisz podac liczbe nie znaki");
       }
        try{
            System.out.println(silnia(-5));
        }
        catch (BlednaWartoscDlaSilniException e){
            System.out.println(e.getMessage());
        }*/
        try{
            Adres adres1 = new Adres(null,"Poziomkowa","32-233",12);
        }
        catch (NieprawidlowyAdresException e){
            System.err.println(e.getMessage());
        }
    }
    public static int silnia(int a) throws BlednaWartoscDlaSilniException{
        if(a<0){
            throw new BlednaWartoscDlaSilniException("Liczba nie moze byc ujemna");
        }
        int wynik =1;
        for(int i =1;i<=a;i++){
            wynik=wynik*a;
        }
        return wynik;
    }
}

