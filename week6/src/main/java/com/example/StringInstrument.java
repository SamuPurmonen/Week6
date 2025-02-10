package com.example;

public class StringInstrument extends Instrument{
    //guitar ja Violin periytyvät tästä luokata
    protected int numberOfStrings;

    public StringInstrument(String manufacturer, int price, int numberOfStrings) {
        super(manufacturer, price);
        this.numberOfStrings = numberOfStrings;
    }

    public StringInstrument(){

    }
    //guitar ja Violin periytyvät tästä luokata

    public void tune(){
        for (int i = 0; i < Instruments.size(); i++){
            
            if (Instruments.get(i) instanceof Guitar){

                System.out.println(Instruments.get(i).manufacturer + " soittimesta viritettiin 6 kieltä!");
            }
            else if (Instruments.get(i) instanceof Violin){

                System.out.println(Instruments.get(i).manufacturer + " soittimesta viritettiin 4 kieltä!");
            }
        }
    }

    
}
