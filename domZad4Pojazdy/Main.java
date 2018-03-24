package com.company.domZad4Pojazdy;

public class Main {
    public static void main(String[] args) {
        Pociag pociag1 = new Pociag("ursus", 80, 200, 4, false);
        Pociag pociag2 = new Pociag("amadeus", 80, 200, 4, true);
        Samochod auto1 = new Samochod("fiat",120,5,4,3);
        Samochod auto2 = new Samochod("skoda",140,5,4,5);
        Pociag ekspres = new Pociag("ekspres", 160,100,3,true,true);
        System.out.println(pociag1);
        System.out.println(pociag2);
        System.out.println(ekspres);
        System.out.println(auto1);
        System.out.println(auto2);
    }
}
