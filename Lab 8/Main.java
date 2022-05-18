package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws BlednaWartoscSIlniaException {
      /*  Scanner scanner = new Scanner(System.in);
        int n=0;
        while (true) {
            try {
                n = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("podaj poprawna liczbe: ");
                scanner.next();
            }
        }
        if (n < 0) {
            throw new IllegalArgumentException(String.format("silnia z liczby "+n +"nie istnieje"));
        }
        System.out.println(String.format("Silnia z  to ", n, silnia(n)));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        double a = 0;
        while (true) {
            try {
                a = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("podaj poprawna liczbe: ");
                scanner.next();
            }
        }
        if (a < 0) {
            throw new IllegalArgumentException(String.format("pierwiastek kwadratowy z liczby rzeczywistej %.4f nie istnieje", a));
        }
        System.out.println(String.format("Pierwsiatek z %.4f to %.4f", a, Math.sqrt(a)));
    }*/

}
public static int silnia(int n) throws BlednaWartoscSIlniaException {
        int silnia=1;
        for(int i=1;i<=n;i++){
            silnia=silnia*i;
        }
        return silnia;

}

}
