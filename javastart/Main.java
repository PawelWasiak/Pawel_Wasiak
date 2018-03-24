package com.company.javastart;
/*
2.6 Stwórz klasę Punkt2D, która przechowuje informacje na temat punktu na przestrzeni dwuwymiarowej
(współrzędne x oraz y). Zawierająca dwa konstruktory: bezparametrowy ustawiający pola na wartość 0, oraz przyjmujący
dwa argumenty i ustawiający pola obiektu zgodnie z podanymi parametrami.

Napisz klasę Punkt3D dziedziczącą po Punkt2D, reprezentującą punkt w trójwymiarze (dodatkowe pole z).

W klasie testowej utwórz obiekty obu klas i przetestuj działanie.
 */

public class Main {


    public static void main(String[] args) {
Punkt2 punkt = new Punkt2();
Punkt2 punkt1 = new Punkt2(10,20);
Punkt3 punkt2 = new Punkt3(5,punkt1);
        System.out.println(punkt);
        System.out.println(punkt1);
        System.out.println(punkt2);
    }
}