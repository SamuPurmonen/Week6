package com.example;

public class StringInstrument extends Instrument{
    //guitar ja Violin periytyvät tästä luokata
    protected int numberOfStrings;

    public StringInstrument(String manufacturer, int price, int numberOfStrings) {
        super(manufacturer, price);
        this.numberOfStrings = numberOfStrings;
    }
    //guitar ja Violin periytyvät tästä luokata

    public void tune(){
        //tulostaa X soittimesta viritettiin Y kieltä
        //eli tarkastaa olion kielenten määrän
    }

    
}
