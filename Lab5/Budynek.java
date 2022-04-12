package pl.krzychulecjava;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Budynek {
    LocalDate rokBudowy;
    String nazwa;
    int l_pieter;

    public Budynek(LocalDate rokBudowy, String nazwa, int l_pieter) {
        this.rokBudowy = rokBudowy;
        this.nazwa = nazwa;
        this.l_pieter = l_pieter;
    }
    public long DataBudowy(){
        LocalDate today=LocalDate.now();
        long ilosc_czasu= ChronoUnit.YEARS.between(rokBudowy,today);
        return ilosc_czasu;
    }
    public void info(){
        System.out.println("Nazwa buynku: "+nazwa+" Ilosc pieter: "+l_pieter+" rok budowy: "+rokBudowy+" wiek budynku: "+DataBudowy());
    }
}
