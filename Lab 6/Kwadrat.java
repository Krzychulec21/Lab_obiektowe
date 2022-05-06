package pl.krzychulecjava;

public class Kwadrat extends Prostokat {
    double bok_a;


    public Kwadrat(String kolor, double bok_a ) {
        super(kolor, bok_a,bok_a);
        this.bok_a=bok_a;
    }




    public double getBok_a() {
        return bok_a;
    }

    public void setBok_a(double bok_a) {
        this.bok_a = bok_a;
    }
@Override
    String opis() {
            return super.opis();
}
}
