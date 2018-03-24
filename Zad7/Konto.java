package com.company.Zad7;

import com.company.Zad6.Osoba;

public class Konto {
    private int stan;
    private int numerRachuku;
    private Osoba osoba;

    public Konto(int stan, int numerRachuku, Osoba osoba) {
        this.stan = stan;
        this.numerRachuku = numerRachuku;
        this.osoba = osoba;
    }

    public boolean wyplata(int kwotawyplacona) {
        if (stan >= kwotawyplacona) {
            stan -= kwotawyplacona;
            return true;
        }
        System.out.println("za mala kwota na rachunku");
        return false;

    }

    public boolean wplata(int wplaconaKwota) {
        stan += wplaconaKwota;
        return true;
    }

    public int getStan() {
        return stan;
    }

    public String przelewSrodkow(int kwotaPrzelewu, Konto rachunekDocelowy) {
        return przelewSrodkow(kwotaPrzelewu, rachunekDocelowy, 0);
    }

    protected String przelewSrodkow(int kwotaPrzelewana, Konto rachunekDocelowy, int prowizja) {
        if (kwotaPrzelewana+prowizja > stan) {
            System.out.println("przelewana kwota jest zbyd duza");
            return "transakcja nieudana";
        }
        stan -= kwotaPrzelewana + prowizja;
        rachunekDocelowy.wplata(kwotaPrzelewana);
        return "transakcja udana";
    }

    public static String zKontaNaKonto(Konto kontoNadawcy, Konto beneficjent, int kwota) {
        if (kwota > kontoNadawcy.getStan()) {
            return String.format("masz na rachunku %s a chcesz przelać %s co przekracza jego stan",
                    kontoNadawcy.getStan(), kwota);
        }
        kontoNadawcy.wyplata(kwota);
        beneficjent.wplata(kwota);
//        kontoNadawcy.przelewSrodkow(kwota, beneficjent);
        return String.format("na rachunek odbiory przelano %s " +
                        "na koncie nadawcy zostalo %s a na koncie beneficjenta %s",
                kwota, kontoNadawcy.getStan(), beneficjent.getStan());

    }
}
