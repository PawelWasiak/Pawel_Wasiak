package com.company.Zad7;
/*
*ZADANIE #7*
Utwórz klasę `Konto`, która zawiera pola `stan`, `numer`, `wlasciciel` (klasa `Osoba`) oraz metody
umożliwiające wpłatę, wypłatę, przelewanie środków, sprawdzenie status konta.

Utworz klasę `KontoOszczednosciowe`, które dodatkowo zawiera pole `procentOszczednosci`
(dodawany za każdą transakcję)

Utworz klasę `KontoFirmowe`, które dodatkowo zawiera pole `oplataZaTransakcje`
(odejmowany od stanu konta *przy każdej transakcji*)
 */

import com.company.Zad6.Osoba;

public class Main {
    public static void main(String[] args) {

//        testykontaFirmowego();
        testyKontaOszczednosciowego();

//        testyKontaPrywatnego();
    }

    private static void testyKontaOszczednosciowego() {
        Osoba osoba3= new Osoba("wojtek",30);
        KontoOszczednosciowe kontoOszczednosciowe = new KontoOszczednosciowe(400,505,osoba3 );
        kontoOszczednosciowe.wplata(100);
        kontoOszczednosciowe.wplata(100);
        System.out.println(kontoOszczednosciowe.getStan());
        kontoOszczednosciowe.wplata(100);
        System.out.println(kontoOszczednosciowe.getStan());
    }

    private static void testykontaFirmowego() {
        Osoba osoba2 = new Osoba("anrzej", 24);
        KontoFirmowe firmowe = new KontoFirmowe(5000, 503, osoba2);
        KontoFirmowe firmowe2 = new KontoFirmowe(3000,504,osoba2 );
        System.out.println(firmowe.getStan());
        firmowe.wplata(100);
        System.out.println(firmowe.getStan());
        System.out.println(firmowe.getStan());
        firmowe.wyplata(200);
        firmowe.przelewSrodkow(300,firmowe2);
        System.out.println(firmowe.getStan());
        System.out.println(firmowe2.getStan());
    }

    private static void testyKontaPrywatnego() {
        Osoba klient1 = new Osoba("adam", 22);
        Osoba klient2 = new Osoba("michal", 33);
        Konto konto1 = new Konto(1000, 001, klient1);
        Konto konto2 = new Konto(2000, 002, klient2);
        System.out.println(konto1.getStan());
        System.out.println(konto2.getStan());
        konto1.przelewSrodkow(400, konto2);
        System.out.println(konto1.getStan());
        System.out.println(konto2.getStan());
        String komunikat = Konto.zKontaNaKonto(konto1, konto2, 200);
        System.out.println(komunikat);
        System.out.println(konto1.getStan());
        System.out.println(konto2.getStan());
        konto1.wplata(400);
        System.out.println(konto1.getStan());
        konto1.wyplata(2000);
        System.out.println(konto1.getStan());
    }
}