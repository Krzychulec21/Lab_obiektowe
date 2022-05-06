package pl.krzychulecjava;

public class Punkt {
    public int x,y; //pola klasy

    //konstruktor bezparametrowy
    public Punkt() {
        this.x = 0;
        this.y = 0;
    }

    //konstruktor parametrowy

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void zeruj(){
        this.x=0;
        this.y=0;
}
    public void opis(){
        System.out.println("Punkt o wspolrzednych: "+x+" "+y);
    }
    public void przesun(int x, int y){
        this.x+=x;
        this.y+=y;
    }


}
