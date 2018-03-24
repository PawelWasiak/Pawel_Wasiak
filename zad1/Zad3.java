package com.company.zad1;
/*
*ZADANIE #3*
Utwórz metodę, która wykorzystuje *varargs* by przekazać do metody dowolną, większą od zera,
liczbę elementów typu `String` i zwrócić jeden napis sklejony z nich.
 */

public class Zad3 {
    public static void main(String[] args) {
        String wynik = sklejTekst("mam", "na", "imie", "Pawel");
        System.out.println(wynik);
    }

    private static String sklejTekst(String pierwszyTekst, String... napisy) {

        String pelenNapis = pierwszyTekst;
        for (String s : napisy) {
            pelenNapis += " " + s;
        }
        return pelenNapis;
    }
}
//    StringBuilder pelenNapis = new StringBuilder(pierwszyTekst);
//        for (String s : napisy) {
//        pelenNapis.append(s);
//    }
//        return pelenNapis.toString();
//    }

