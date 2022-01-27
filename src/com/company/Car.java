package com.company;

public class Car  implements Printable{
    private int year, volum;

    public int getYear() {
        return year;
    }

    public int getVolum() {
        return volum;
    }

    public Car(int year, int volum) {
        this.year = year;
        this.volum = volum;
    }

    @Override
    public void print() {
        System.out.println("year " + this.year +"\n " +
                "volume; " + this.volum);
    }
}