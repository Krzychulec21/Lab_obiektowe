package pl.krzychulecjava;

public class Okrag extends Figura {

    Punkt srodek;
    double promien;

    public double getPowierzchnia(){
        return Math.PI*Math.pow(promien,2);
    }
    public double getSrednica(){
        return 2*promien;
    }
    public void setPromien(double p){
        this.promien = p;
    }
    public boolean wSrodku(Punkt p){
       if((Math.pow((p.x+srodek.x),2) + Math.pow((p.y + srodek.y),2))<= Math.pow(promien,2))
       return true;
       else return false;
    }
    public  Okrag () {
        this.promien = 0;
        this.srodek.x = 0;
        this.srodek.y = 0;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    @Override
    String opis() {
        return super.opis();
    }
}
