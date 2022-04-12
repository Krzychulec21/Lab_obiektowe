package pl.krzychulecjava;

public class Prostokat {
    int a,b;

    public Prostokat(int a, int b) {
        this.a =a;
        this.b =b;
    }
    void pole(){
        System.out.println("pole: "+a*b);
    }
    void obwod(){
        System.out.println("obwod: "+(2*a+2*b));
    }
    void przekatna(){
        System.out.println("przekatna: "+ (Math.sqrt(a*a+b*b)));
    }

}
