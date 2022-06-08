package com.andrzejnowiczenko;

public class Motocycle extends Vehicle{

    private int cilinderCapacity;

    Motocycle(String brand, String model, int mileage, String condition, int cilinderCapacity) {
        super(brand, model, mileage, condition);
        this.cilinderCapacity = cilinderCapacity;
    }
}
