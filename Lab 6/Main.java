package pl.krzychulecjava;

public class Main {

    public static void main(String[] args) {
    /*    Punkt p1 = new Punkt();
        Punkt p2 = new Punkt(3,4);
        Figura f1 = new Figura();
        Trojkat t1 = new Trojkat(8,10);
        Prostokat pros1 = new Prostokat(8,8);

        p1.opis();
        p1.przesun(4,5);
        p1.opis();

        p2.opis();
        p2.przesun(6,3);
        p2.opis();

        System.out.println(f1.opis());
        System.out.println(t1.podst=5);
        System.out.println(t1.wys=5);
        System.out.println(pros1.getPowierzchnia());

        pros1.przesun(3,5);
        System.out.println(pros1.punkt.x + " "+ pros1.punkt.y);

        Kwadrat kwadrat1 = new Kwadrat("czarny", 6);

        System.out.println( kwadrat1.opis());
        System.out.println(f1.opis());
        System.out.println(pros1.opis());
        System.out.println( t1.opis());*/

    /*Samochod s1 = new Samochod("BMW","X6","Sedan","Biały",-199000,2018);
    s1.opis();
    SamochodOsobowy osobowy = new SamochodOsobowy();
    osobowy.opis();
    Samochod s2 = new Samochod();
    s2.opis(); */

        Ksiazka ksiazka1 = new Ksiazka("MIeckiewicz","Nowa era",1999);
        Ksiazka powiesc1 = new Powiesc("Słowacki","Liburs",1870,"Ballada");
        Podrecznik podrecznik1 = new Podrecznik("Skoczylas","PWW",2010,"Matematyka");
        podrecznik1.opis();
        ksiazka1.opis();
        powiesc1.opis();
        Ksiegarnia sklep1 = new Ksiegarnia(true);
        Klient gosc1 = new Klient("Jan","Kowalski");
        System.out.println(gosc1.getImie());
        System.out.println(gosc1.getNazwisko());
        sklep1.sklep();
    }

}
