package com.company;

public class Tesla extends Car {

    private String capacity;

    public Tesla(int year, int volum, String capacity) {
        super(year, volum);
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity + "mAh";
    }

    @Override
    public void print() {
        super.print();
        System.out.println("capacity : " + capacity + "mAh");

    }
}