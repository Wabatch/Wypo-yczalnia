package com.andrzejnowiczenko;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Rent {
    private static final AtomicInteger count = new AtomicInteger(0);
    int id;
    Customer customer;
    Vehicle vehicle;
    Date dateOfRent;
    Date dateOfReturn;

    public Rent(Customer customer, Vehicle vehicle, Date dateOfRent, Date dateOfReturn) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.dateOfRent = dateOfRent;
        this.dateOfReturn = dateOfReturn;
        this.id = count.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Date getDateOfRent() {
        return dateOfRent;
    }

    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", customer=" + customer +
                ", vehicle=" + vehicle +
                ", dateOfRent=" + dateOfRent +
                ", dateOfReturn=" + dateOfReturn +
                '}';
    }
}
