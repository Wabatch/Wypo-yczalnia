package com.andrzejnowiczenko;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Rent implements Serializable {
    private static final AtomicInteger count = new AtomicInteger(0);
    int id;
    Customer customer;
    Vehicle vehicle;
    LocalDate dateOfRent;
    LocalDate dateOfReturn;

    public Rent(Customer customer, Vehicle vehicle, LocalDate dateOfRent, LocalDate dateOfReturn) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.dateOfRent = dateOfRent;
        this.dateOfReturn = dateOfReturn;
        this.id = count.incrementAndGet();
    }


    @Override
    public String toString() {
        return "Wypożyczenie nr " + id +
                ", Klient " + customer +
                ", Pojazd " + vehicle +
                ", Data wypożyczenia " + dateOfRent +
                ", Data zwrotu " + dateOfReturn +
                '}';
    }
}
