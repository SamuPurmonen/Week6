package com.example;

public class Guitar extends StringInstrument {

    public Guitar(String manufacturer, int price) {
        super(manufacturer, price, 6);
        numberOfStrings = 6;
    }

}
