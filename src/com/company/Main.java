package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Mers").print();
        createObject("Tesla").print();
        createObject("Tayota").print();
    }
    static Printable createObject(String name){
        switch (name){
            case "Mers":
                return new Mers(2020,4,"X5");
            case "Tesla":
                return new Tesla(2022,2,"60 kWt");
            case "Tayota":
                return new Tayota(2015,3,"AWD");
            default:return null;



        }
    }

}