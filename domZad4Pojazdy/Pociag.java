package com.company.domZad4Pojazdy;

public class Pociag extends Pojazd {
    int liczbaWagonow;
    boolean czyMaWagonBarowy;
    boolean czyPospieszny;

    public Pociag(String nazwa, int maxPredkosc, int liczbaPasazerow, int liczbaWagonow, boolean czyMaWagonBarowy) {
        super(nazwa, maxPredkosc, liczbaPasazerow);
        this.liczbaWagonow = liczbaWagonow;
        this.czyMaWagonBarowy = czyMaWagonBarowy;
    }

    public Pociag(String nazwa, int maxPredkosc, int liczbaPasazerow, int liczbaWagonow, boolean czyMaWagonBarowy, boolean czyPospieszny) {
        super(nazwa, maxPredkosc, liczbaPasazerow);
        this.liczbaWagonow = liczbaWagonow;
        this.czyMaWagonBarowy = czyMaWagonBarowy;
        this.czyPospieszny = czyPospieszny;
    }

    @Override
    public String toString() {
        return "Pociag{" +
                "liczbaWagonow=" + liczbaWagonow +
                ", czyMaWagonBarowy=" +( czyMaWagonBarowy ? "ma wagon barowy":"brak wagonu barowego")+
                ", nazwa='" + nazwa + '\'' +
                ", maxPredkosc=" + maxPredkosc +
                ", liczbaPasazerow=" + liczbaPasazerow +
                (czyPospieszny? " pospieszny":"")
                +'}';
    }

}
