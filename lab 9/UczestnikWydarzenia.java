package pl.krzychulecjava;

import java.util.ArrayList;
import java.util.Objects;

public class UczestnikWydarzenia {
    int ID,wiek;
    String imie;

    public UczestnikWydarzenia(int ID, int wiek, String imie) {
        this.ID = ID;
        this.wiek = wiek;
        this.imie = imie;
    }




    @Override
    public String toString() {
        return "UczestnikWydarzenia{" +
                "ID=" + ID +
                ", wiek=" + wiek +
                ", imie='" + imie + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UczestnikWydarzenia that = (UczestnikWydarzenia) o;
        return ID == that.ID && wiek == that.wiek && Objects.equals(imie, that.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, wiek, imie);
    }
}
