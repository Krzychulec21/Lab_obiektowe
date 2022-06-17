package pl.krzychulecjava;


import java.security.CodeSigner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      /*  ArrayList listaUczestnikowStarzy = new ArrayList();
        ArrayList listaUczestnikowMlodzi = new ArrayList();

        UczestnikWydarzenia os1 = new UczestnikWydarzenia(1, 3, "marek");
        UczestnikWydarzenia os2 = new UczestnikWydarzenia(2, 59, "Krzych");
        UczestnikWydarzenia os3 = new UczestnikWydarzenia(3, 23, "Maria");
        UczestnikWydarzenia os4 = new UczestnikWydarzenia(4, 13, "Wojtek");
        UczestnikWydarzenia os5 = new UczestnikWydarzenia(5, 43, "Natalia");
        if (os1.wiek < 18)
            listaUczestnikowMlodzi.add(os1);
        else listaUczestnikowStarzy.add(os1);
*/

       /* Scanner scann = new Scanner(System.in);
        int a;
        Pracownik[] p = new Pracownik[10];
        for (int i = 0; i < 10; i++) {
            p[i] = new Pracownik(a = scann.nextInt());
        }
        List<Pracownik> listaPracownikow = new LinkedList<>();
        for (Pracownik n : p) {
            listaPracownikow.add(n);
        }
        listaPracownikow.subList(1,3).clear();
        System.out.println(listaPracownikow);

        */
        List<Integer>listaLiczb = new LinkedList<>();
        for(int i=0;i<11;i++){
            listaLiczb.add(i);
        }
        System.out.println(listaLiczb);
        List<Integer>drugaLista = new LinkedList<>();
        ListIterator<Integer>a=listaLiczb.listIterator(11);
        while(a.hasPrevious()){
            drugaLista.add(a.previous());
        }
        System.out.println(drugaLista);

    }
}
