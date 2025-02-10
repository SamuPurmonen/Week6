package com.example;

import static com.example.Instrument.Instruments;

public class Drum extends Instrument{
    
    public Drum(String manufacturer, int price) {
        super(manufacturer, price);
    }

    public Drum(){

    }

    public void playBeat(){
        //tämän täytyy soittaa kaikkia luotuja rumpuja
        for (int i = 0; i < Instruments.size(); i++){
                
                if (Instruments.get(i) instanceof Drum){

                    System.out.println(Instruments.get(i).manufacturer + " rummut soittavat komppia!");
                }
            }
        

    }
    
}
