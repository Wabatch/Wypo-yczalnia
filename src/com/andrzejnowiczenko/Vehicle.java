package com.andrzejnowiczenko;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Vehicle {

    private static final AtomicInteger count = new AtomicInteger(0);
    int id;
    private String brand;
    private String model;
    private int mileage;
    private String condition;
    boolean isAvailable;

    Vehicle(String brand, String model, int mileage, String condition) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.condition = condition;
        this.id = count.incrementAndGet();
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public String getCondition() {
        return condition;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", condition='" + condition + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
