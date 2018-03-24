package com.company.Zad5;
/*
*ZADANIE #5*
Utwórz klasę `Osoba`, która zawiera pola `imie`, `wiek`.
Następnie utwórz klasę `Pracownik`, która zawiera dodatkowe pola `pensja`. (edited)
 */

public class Osoba {
    protected int wiek;
    protected String imie;

    public Osoba(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "wiek=" + wiek +
                ", imie='" + imie + '\'' +
                '}';
    }
}
