package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("1) Lisää soitin\r\n"
                    + //
                    "2) Listaa soittimet\r\n"
                    + //
                    "3) Viritä kielisoittimet\r\n"
                    + //
                    "4) Soita rumpuja\r\n"
                    + //
                    "0) Lopeta ohjelma");

            int i = 0;
            String stringInput = sc.nextLine();
            i = Integer.parseInt(stringInput);

            switch (i) {

                case 1:
                    System.out.println("Minkä soittimen haluat lisätä? 1) Kitara, 2) Viulu, 3) Rummut");

                    int case1Input = Integer.parseInt(sc.nextLine());

                    System.out.println("Anna valmistajan nimi:");
                    String manufacturer = sc.nextLine();

                    System.out.println("Anna hinta euroina:");
                    int price = Integer.parseInt(sc.nextLine());

                    //jostain syystä StringInsturment haluaa myös kielten määrän määrittelyyn vaikka se tehdään erikseen jo Guitar ja Violin
                    //.javassa joten laitetaan placegholderiksi null;
                    // anna halutulle oliolle tiedot
                    //if tai case loop ja tarkista numerolla mikä olio luodaan
                    if (case1Input == 1) {
                        //luo kiraraolio
                        Guitar guitar = new Guitar(manufacturer, price, 6);
                    } else if (case1Input == 2) {
                        Violin violin = new Violin(manufacturer, price, 4);
                        //luo viuluolio
                    } else if (case1Input == 3) {
                        Drum drum = new Drum(manufacturer, price);
                        //luo rumpuolio
                    } else {
                        System.out.println("Virheellinen soitinvalinta.");
                    }

                    break;

                case 2:
                    //listaa soittimet
                    Instrument instrument = new Instrument();
                    instrument.getDetails();
                    break;

                case 3:
                    StringInstrument stringInstrument = new StringInstrument();
                    stringInstrument.tune();
                    break;

                case 4:
                    //soita rumpuja
                    Drum drum = new Drum();
                    drum.playBeat();
                    break;

                case 0:
                    exit = true;
                    System.out.println("Kiitos ohjelman käytöstä.");
                    break;

                default:
                    System.err.println("Syöte oli väärä.");
                    break;
            }

        }

    }
}
