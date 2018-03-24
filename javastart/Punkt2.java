package com.company.javastart;

public class Punkt2 {
    double x;
    double y;

    public Punkt2() {
        x=0;
        y=0;
    }

    public Punkt2(double podajx, double podajyy) {
        this.x = podajx;
        this.y = podajyy;
    }

    @Override
    public String toString() {
        return "Punkt2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
