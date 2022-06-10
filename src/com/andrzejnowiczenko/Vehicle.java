package com.andrzejnowiczenko;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Vehicle implements Serializable {

    protected static final AtomicInteger count = new AtomicInteger(0);
    protected int id;
    protected String brand;
    protected String model;
    protected int mileage;
    protected String condition;
    protected boolean isAvailable;

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

    public String isAvalibleResolver(){
        if(this.isAvailable){
            return "tak";
        }
        return "nie";
    }


    @Override
    public String toString() {

        return  "(" + id +
                ")" + brand + " " + model +
                " przebieg: " + mileage +
                " stan: " + condition +
                " dostępny: " + isAvalibleResolver();
    }
}
