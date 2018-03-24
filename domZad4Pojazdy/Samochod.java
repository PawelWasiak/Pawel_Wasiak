package com.company.domZad4Pojazdy;

public class Samochod extends Pojazd {
    int liczbaKol, liczbaDrzwi;

    public Samochod(String nazwa, int maxPredkosc, int liczbaPasazerow, int liczbaKol, int liczbaDrzwi) {
        super(nazwa, maxPredkosc, liczbaPasazerow);
        this.liczbaKol = liczbaKol;
        this.liczbaDrzwi = liczbaDrzwi;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "liczbaKol=" + liczbaKol +
                ", liczbaDrzwi=" + liczbaDrzwi +
                ", nazwa='" + nazwa + '\'' +
                ", maxPredkosc=" + maxPredkosc +
                ", liczbaPasazerow=" + liczbaPasazerow +
                '}';
    }
}
