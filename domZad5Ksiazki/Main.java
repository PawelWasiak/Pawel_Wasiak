package com.company.domZad5Ksiazki;
/*
Utwórz klasę Produkt (z polami cena). Utwórz nową klasę Książka
(z polami Autor, liczbaStron i czyTwardaOprawka) która dziedziczy z klasy Produkt.
 */

public class Main {
    public static void main(String[] args) {
        Produkt produkt = new Produkt(32);
        Ksiazka ksiazka1 = new Ksiazka(34.55,"Adam Adam",140,true);
        System.out.println(ksiazka1);
    }
}
