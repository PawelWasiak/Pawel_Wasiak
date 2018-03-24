package com.company.Zad7;

import com.company.Zad6.Osoba;

public class KontoFirmowe extends Konto {
    private int oplataZaTransakcje=5;

    public KontoFirmowe(int stan, int numerRachuku, Osoba osoba) {
        super(stan, numerRachuku, osoba);
    }

    public void setOplataZaTransakcje(int oplataZaTransakcje) {
        this.oplataZaTransakcje = oplataZaTransakcje;
    }

    @Override
    public boolean wyplata(int kwotawyplacona) {
        return super.wyplata(kwotawyplacona+oplataZaTransakcje);
    }

    @Override
    public boolean wplata(int wplaconaKwota) {
        return super.wplata(wplaconaKwota-oplataZaTransakcje);
    }

//    String przelewSrodkow(int kwotaPrzelewana, Konto rachunekDocelowy) {
//        return super.przelewSrodkow(kwotaPrzelewana, rachunekDocelowy,oplataZaTransakcje);
//    }
}
