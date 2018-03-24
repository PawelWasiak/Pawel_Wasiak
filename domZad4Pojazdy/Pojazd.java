package com.company.domZad4Pojazdy;
/*
Utwórz klasę Pojazd (z polami nazwa, maxPredkosc i liczbaPasazerow) a
następnie klasy Samochod (z polami liczbaKol i liczbaDrzwi) i Pociag (z polami liczbaWagonow, czyMaWagonBarowy).
Dodaj w każdej z klas nowe pola i przetestuj działanie.
 */

public class Pojazd {
    String nazwa;
    int maxPredkosc, liczbaPasazerow;

    protected Pojazd(String nazwa, int maxPredkosc, int liczbaPasazerow) {
        this.nazwa = nazwa;
        this.maxPredkosc = maxPredkosc;
        this.liczbaPasazerow = liczbaPasazerow;
    }
}
