package com.company.zad1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zad4a {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        System.out.println("arraylist");
        wstawNaKoniec(lista, 10000_000);
        System.out.println("set");
        wstawNaKoniecSet(set,10000_000);

    }
    private static void wstawNaKoniec(List<Integer> list, int liczbaElementow) {
        long poczatek = System.currentTimeMillis();
        for (int i = 0; i < liczbaElementow; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("czas wykonania : " + (end - poczatek) + " ms");
    }
    private static void wstawNaKoniecSet(Set<Integer> set, int liczbaElementow) {
        long poczatek = System.currentTimeMillis();
        for (int i = 0; i < liczbaElementow; i++) {
            set.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("czas wykonania : " + (end - poczatek) + " ms");
    }
}
