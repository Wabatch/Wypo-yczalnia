package com.andrzejnowiczenko;

import java.util.Scanner;

public class Motorcycle extends Vehicle{

    private final int cilinderCapacity;

    Motorcycle(String brand, String model, int mileage, String condition, int cilinderCapacity) {
        super(brand, model, mileage, condition);
        this.cilinderCapacity = cilinderCapacity;
    }

    public static Motorcycle newMotorcycle(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj marke");
        String brand = scanner.next();
        System.out.println("podaj model");
        String model = scanner.next();
        System.out.println("podaj przebieg");
        int mileage = scanner.nextInt();
        System.out.println("podaj stan");
        String condition = scanner.next();
        System.out.println("podaj pojemnosc silnika:");
        int cilinderCapacity = scanner.nextInt();

        return new Motorcycle(brand, model, mileage, condition, cilinderCapacity);
    }
}
