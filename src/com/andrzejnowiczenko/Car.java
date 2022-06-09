package com.andrzejnowiczenko;

import java.util.Scanner;

public class Car extends Vehicle{


    private int seats;

    Car(String brand, String model, int mileage, String condition, int seats) {
        super(brand, model, mileage, condition);
        this.seats = seats;
    }

    public static Car newCar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj marke");
        String brand = scanner.next();
        System.out.println("podaj model");
        String model = scanner.next();
        System.out.println("podaj przebieg");
        int mileage = scanner.nextInt();
        System.out.println("podaj stan");
        String condition = scanner.next();
        System.out.println("podaj ilosc miejsc siedzacyh");
        int seats = scanner.nextInt();

        return new Car(brand, model, mileage, condition, seats);
    }


}
