package com.andrzejnowiczenko;

import java.util.concurrent.atomic.AtomicInteger;

public class Customer {

    //licznik ktory zwieksza sie z kazdym nowym obiektem
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private final String name;

    public Customer(String name){
        this.name = name;
        this.id = count.incrementAndGet();
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
