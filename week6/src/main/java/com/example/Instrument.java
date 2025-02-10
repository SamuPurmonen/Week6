package com.example;

import java.util.ArrayList;

public class Instrument {

    //drum ja StringInstrument periytyy tästä luokasta
    protected String manufacturer;
    protected int price;
    protected static ArrayList<Instrument> Instruments = new ArrayList<>();

    public Instrument(String manufacturer, int price) {
        this.manufacturer = manufacturer;
        this.price = price;

        Instruments.add(this);
        System.out.println("Soitin lisätty listaan!");
    }

    public Instrument() {

    }

    public String getDetails() {

        if (Instruments.isEmpty()) {
            System.out.println("Ei lisättyjä soittimia.");
        } else {

            for (int i = 0; i < Instruments.size(); i++) {
                System.out.println("Valmistaja: " + Instruments.get(i).manufacturer + ", Hinta: " + Instruments.get(i).price + "e");
                
            }
        }
        
        return "Valmistaja: " + Instruments.get(Instruments.size()).manufacturer + ", Hinta: " + Instruments.get(Instruments.size()).price + "e";
        // miksi tässä pitäisi edes palauttaa mitään kun se voi kertoa ne yksityiskohdat tässä
    }

}
