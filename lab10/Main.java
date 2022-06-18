package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //zad1

      /*  List<Kangur> listaKangurow = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listaKangurow.add(new Kangur(i));
        }
        System.out.println(listaKangurow);

        for(int i=0; i<listaKangurow.size(); i++) {
          listaKangurow.get(i).skok();
        }

        Map<String,Kangur> mapaKangurow = new HashMap<>();
        mapaKangurow.put("Michal",listaKangurow.get(0));
        mapaKangurow.put("Zosia",listaKangurow.get(1));

        Set<Map.Entry<String, Kangur>> entries = mapaKangurow.entrySet();
        Iterator<Map.Entry<String, Kangur>> kangurIterator =
                entries.iterator();
        while(kangurIterator.hasNext()) {
            Map.Entry<String, Kangur> entry = kangurIterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        */
/*
        //zad 3
        Stos<String>  stos = new Stos<>();
        String wyrazenie =" +B+a+ł---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---";
        //nie wiedzialem jak dokonczyc
*/
        //zad 4
        /*
        String[] produkty = {"mleko","jajka","chleb","cukier","maka","drodze","smietana","maslo","bulki","woda"};
        Stos<String> zakupy = new Stos<>();
        for (int i = 0; i < 7; i++) {
            zakupy.push(produkty[i]);
        }
        Queue<String> kupowanie = new LinkedList<>();
        //?
        */
        //zad 5
        Map<Integer,Film> prywatnaKolekcja = new HashMap<>();
        Komedia f1 = new Komedia(123,"Venom",false);
        Horror f2 = new Horror(90,"Matrix",true);
        prywatnaKolekcja.put(1,f1);
        prywatnaKolekcja.put(2,f2);

        Set<Map.Entry<Integer, Film>> entries = prywatnaKolekcja.entrySet();
        Iterator<Map.Entry<Integer, Film>> prywatnaKolekcjaIterator = entries.iterator();

        while(prywatnaKolekcjaIterator.hasNext()) {
            Map.Entry<Integer, Film> entry = prywatnaKolekcjaIterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }

    }



