package com.company.Zad5;

public class Kierownik extends Pracownik {
    int premia;
    public Kierownik(int wiek, String imie, int pensja, int premia) {
        super(wiek, imie, pensja);
    this.premia=premia;
    }

    @Override
    public int policzpensje() {
        return super.policzpensje()+premia;
    }
}
