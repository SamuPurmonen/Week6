package com.example;

import java.util.ArrayList;


public class Instrument {
    //drum ja StringInstrument periytyy tästä luokasta
    protected String manufacturer;
    protected int price;
    ArrayList<Instrument> Instruments = new ArrayList<>();


    
    public Instrument(String manufacturer, int price){
        this.manufacturer = manufacturer;
        this.price = price;

        Instruments.add(this);
    }

    public String getDetails(){
        for (int i = 0; i < Instruments.size(); i++){
            System.out.println("Valmistaja " + Instruments.get(i).manufacturer +", Hinta " + Instruments.get(i).price);
        }
        
        return "Valmistaja " + manufacturer +", Hinta " + price;
        // miksi tässä pitäisi edes palauttaa mitään kun se voi kertoa ne yksityiskohdat tässä
    }

}
