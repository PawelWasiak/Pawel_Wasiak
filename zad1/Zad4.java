package com.company.zad1;
/*
Utwórz metody które będą testować czas działania dwóch implementacji listy (tzn. `List`) -
`ArrayList` i `LinkedList`. Do pomiaru czasu wykorzystaj `System.currentTimeMillis();`. Sprawdź czas:
> wstawiania na koniec (np. 500_000 elementów)
> wstawiania na początek (np. 500_000 elementów)
> wybierania po indeksie (tzn. 500_000 razy pobierz element pod jakimś indeksem)
> sumowania wszysch elementów przy wykorzystaniu pętli - for
> sumowania wszysch elementów przy wykorzystaniu pętli - foreach
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zad4 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linekList = new LinkedList<>();
        System.out.println("arraylist");
        wstawNaKoniec(arrayList, 1000_000);
        System.out.println("linkedlist");
        wstawNaKoniec(linekList, 1000_000);

        System.out.println();

//        System.out.println("arraylist");
//        wstawNaPoczatek(new ArrayList<>(), 200_000);
//        System.out.println("linkedlist");
//        wstawNaPoczatek(new LinkedList<>(), 200_000);

        System.out.println();

//        System.out.println("arraylist");
//        wybierzPoIndeksie(arrayList);
//        System.out.println("lindekList");
//        wybierzPoIndeksie(linekList);


//        System.out.println("arraylist");
//        wybierzPoIndeksieForEach(arrayList);
//        System.out.println("linkedlist");
//        wybierzPoIndeksieForEach(linekList);

        System.out.println("arraylist");
        wstawNaSrodku(arrayList, 10000);
        System.out.println("linkedlist");
        wstawNaSrodku(linekList, 10000);




    }

    private static void wstawNaSrodku(List<Integer> list, int ileElementow) {
        long poczatek = System.currentTimeMillis();
        for (int i = 0; i < ileElementow; i++) {
            list.add(list.size()/2,i);
        }
        long end = System.currentTimeMillis();
        System.out.println("czas wstawianie po środku : " + (end - poczatek) + " ms");



    }

    private static void wybierzPoIndeksie(List<Integer> list) {
        long suma=0;
        long poczatek = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            suma += list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(suma);
        System.out.println("czas wybierania po indeksie : " + (end - poczatek) + " ms");

    }

    private static void wybierzPoIndeksieForEach(List<Integer> list) {
        long suma=0;
        long poczatek = System.currentTimeMillis();
        for (int i : list) {
            suma += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(suma);
        System.out.println("czas wybierania po indeksie : " + (end - poczatek) + " ms");

    }
    private static void wstawNaPoczatek(List<Integer> list, int liczbaElementow) {
        long poczatek = System.currentTimeMillis();
        for (int i = 0; i < liczbaElementow; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("czas wykonania : " + (end - poczatek) + " ms");
    }

    private static void wstawNaKoniec(List<Integer> list, int liczbaElementow) {
        long poczatek = System.currentTimeMillis();
        for (int i = 0; i < liczbaElementow; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("czas wykonania : " + (end - poczatek) + " ms");
    }
}
