package com.company.Zad5;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba(12, "paweł");
        Osoba osoba2 = new Osoba(22, "gaweł");
        Osoba osoba3 = new Osoba(25, "patryk");
        Pracownik pracownik1 = new Pracownik(21, "michal", 2000);
        Pracownik pracownik2 = new Pracownik(22, "adam", 3000);
        Kierownik kierownik1=new Kierownik(35,"kamil", 5000, 5000);
//        System.out.println(osoba1.imie + ", " +osoba1.wiek);
//        System.out.println(osoba1);
//        System.out.println(pracownik1.imie + ", " + pracownik1.wiek + ", "+ pracownik1.pensja);

        System.out.println("pensja kierownika: " + kierownik1.policzpensje());

        System.out.println("pensja pracownika: "+ pracownik1.policzpensje());
    }
}
