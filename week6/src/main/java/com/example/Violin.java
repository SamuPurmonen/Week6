package com.example;

public class Violin extends StringInstrument {

    public Violin(String manufacturer, int price) {
        super(manufacturer, price, 4);
        numberOfStrings = 4;
    }

}
