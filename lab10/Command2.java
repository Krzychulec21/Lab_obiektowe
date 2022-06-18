package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Command2 {
    Queue<Command> kontener = new LinkedList<>();
    public Queue<Command> dodawanie(){
        kontener.add(new Command("Michał"));
        kontener.add(new Command("Maciek"));
        kontener.add(new Command("Zosia"));
        return this.kontener;
    }
}
