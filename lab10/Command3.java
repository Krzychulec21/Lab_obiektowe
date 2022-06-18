package com.company;

import java.util.Queue;

public class Command3 {
    public void kolejkaKonsum(Queue<Command> kolejka){
        while(kolejka.iterator().hasNext()){
            kolejka.poll().operation();
        }
    }
}
