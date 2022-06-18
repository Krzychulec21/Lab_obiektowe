package com.company;

public class Command {
    String ciag;

    public Command(String ciag) {
        this.ciag = ciag;
    }
    public void operation(){
        System.out.println(this.ciag);
    }
}
