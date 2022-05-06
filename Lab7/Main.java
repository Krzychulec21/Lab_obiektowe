package pl.krzychulecjava;

public class Main {

    public static void main(String[] args) {
	Samolot s1 = new Samolot();
    s1.lec();
    Statek statek1 = new Statek();
    statek1.plynie();
    Wieloryb rybka1 = new Wieloryb();
    rybka1.plyn();
    rybka1.lec();
    rybka1.wynurz();
    rybka1.zanurz();
    }
}
