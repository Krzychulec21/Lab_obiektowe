package pl.krzychulecjava;

public class Pracownik {
    int wiek;

    public Pracownik(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "wiek=" + wiek +
                '}';
    }
}
