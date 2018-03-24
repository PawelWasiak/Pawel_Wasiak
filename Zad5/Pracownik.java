package com.company.Zad5;

public class Pracownik extends Osoba {
    int pensja;


    public Pracownik(int wiek, String imie, int pensja) {
        super(wiek, imie);
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return String.format("imie: %s, wiek: %s, pensja: %s", imie, wiek
                , pensja);
    }

    public int policzpensje() {
        return pensja;
    }

}
