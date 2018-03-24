package com.company.Zad7;

import com.company.Zad6.Osoba;

public class KontoOszczednosciowe extends Konto {
    private int bonus = 10;
    private int licznik = 0;

    public KontoOszczednosciowe(int stan, int numerRachuku, Osoba osoba) {
        super(stan, numerRachuku, osoba);
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean wplata(int wplaconaKwota) {
        licznik++;
        if (licznik % 3 == 0 && licznik<10) {
            wplaconaKwota +=bonus;
        }

        return super.wplata(wplaconaKwota);
    }
}
