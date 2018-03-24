package com.company;

import java.util.ArrayList;
import java.util.List;

public class Testyy {
    public static void main(String[] args) {
        List<String> lista= new ArrayList<>();

        lista.add(0,"lodz");
        lista.add(0,"wwww");
        lista.add(0,"lssss");
        System.out.println(lista);
        List<List<String>> listalist = new ArrayList<>();
        listalist.add(0,lista);
        lista.set(0, "aaaa");
        lista.set(1, "bbbb");
        lista.set(2, "cccc");
        listalist.add(0,lista);

        System.out.println(lista);

        System.out.println(listalist);
    }
}
