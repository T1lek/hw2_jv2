package com.company;

public class Tayota extends Car {
    public Tayota(int year, int volum, String typeOfWheelDrive) {
        super(year, volum);
        this.typeOfWheelDrive = typeOfWheelDrive;
    }

    private String typeOfWheelDrive;

    public String getTypeOfWheelDrive() {
        return typeOfWheelDrive;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Type of wheel drive " + this.typeOfWheelDrive);
    }
}
