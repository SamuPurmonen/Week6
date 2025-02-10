package com.example;

public class Drum extends Instrument{
    
    public Drum(String manufacturer, int price) {
        super(manufacturer, price);
    }


    public void playBeat(){
        //tämän täytyy soittaa kaikkia luotuja rumpuja
        System.out.println(manufacturer + " rummut soittavat komppia!");
    }
    
}
