package com.company.zad1;
/*
        *ZADANIE #1*
Utwórz metodę, która wykorzystuje mechanizm *varargs* by przekazać do metody dowolną,
 większą od zera, liczbę elementów typu `int` i zwrócić ich sumę.

 */

public class Zad1 {
    public static void main(String[] args) {
        int[] tablica = new int[]{2, 3, 4, 5};
        int sumaLiczb = sumujLiczby(5,1,2);
        System.out.println(sumaLiczb);
//        int kolejnaSuma = sumujLiczby(tablica);
//        System.out.println(kolejnaSuma);
    }

    private static int sumujLiczby(int pierwsza, int... liczby) {
        int suma = pierwsza;
        for (int i = 0; i < liczby.length; i++) {
            suma += liczby[i];
        }
        return suma;
    }
}
