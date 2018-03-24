package com.company.javastart;

public class Punkt3 extends Punkt2{
    int z;
    Punkt2 punkt2;

    public Punkt3(double podajx, double podajyy, int z) {
        super(podajx, podajyy);
        this.z = z;
    }

    public Punkt3(int z, Punkt2 punkt2) {
        this.z = z;
        this.punkt2 = punkt2;
    }

    @Override
    public String toString() {
        return "Punkt3{" +
                "z=" + z +
                ", punkt2=" + punkt2 +
                '}';
    }
}
