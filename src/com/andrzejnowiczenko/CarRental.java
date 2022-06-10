package com.andrzejnowiczenko;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRental implements Serializable {

    transient Scanner scanner = new Scanner(System.in);

    List<Customer> customers = new ArrayList<>();
    List<Vehicle> vehicles = new ArrayList<>();
    List<Rent> rents = new ArrayList<>();


    public void addCustomer(){
        System.out.println("podaj imie i nazwisko");

        customers.add(new Customer(scanner.nextLine()));
    }

    public void displayCustomers(){

        if (customers.isEmpty()) {
            System.out.println("Brak klientow, lista pusta.");
        }
        else {
            for (Customer customer : customers) {
                System.out.println(customer.toString());
            }
        }
    }

    public void searchCustomers(){
        System.out.println("Podaj szukane imie lub nazwisko:");
        String name = scanner.nextLine();
        boolean found = false;

        for (Customer customer: customers){
            if (customer.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(customer);
                found = true;
            }
        }

        if (!found)
            System.out.println("Nie znaleziono danego klienta.");
    }

    public void removeCustomer(){
        displayCustomers();

        int nr = scanner.nextInt();
        customers.set(nr - 1, null);
    }


                        //dodaj,usun,wyswietl pojazdy

    public void displayVehicles(){

        if (vehicles.isEmpty()) {
            System.out.println("Brak pojazdow, lista jest pusta.");
        }
        else {
            for(Vehicle vehicle: vehicles){
                System.out.println(vehicle.toString());
            }
        }
    }

    public void searchVehicle(){
        System.out.println("Podaj szukany model:");
        String brand = scanner.nextLine();
        boolean found = false;

        for (Vehicle vehicle: vehicles){
            if (vehicle.getBrand().toLowerCase().contains(brand.toLowerCase())) {
                System.out.println(vehicle);
                found = true;
            }
        }

        if (!found)
            System.out.println("Nie znaleziono danego modelu.");
    }

    public void removeVehicle(){
        displayVehicles();

        int nr = scanner.nextInt();
        vehicles.set(nr-1, null);
    }


    public void addRent() {
        int numberOfDays;
        int customerID;
        int vehicleID;
        boolean found = false;
        Customer rentingCustomer = null;
        Vehicle rentingVehicle = null;

        while(!found) {
            System.out.println("Podaj ID klienta: (Aby anulowac wybierz '0')");
            customerID = scanner.nextInt();
            if(customerID == 0)
                return;
            for (Customer customer : customers) {
                if (customer.getId() == customerID) {
                    System.out.println("Znaleziono dane klienta: " + customer + ". Klient zostanie przypisany do nowego wypozyczenia.");
                    rentingCustomer = customer;
                    found = true;
                }
            }

            if (!found)
                System.out.println("Nie znaleziono danego klienta.");
        }

        found = false;
        while(!found) {
            System.out.println("Podaj ID pojazdu: (Aby anulowac wybierz '0')");
            vehicleID = scanner.nextInt();
            if(vehicleID == 0)
                return;
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getId() == vehicleID) {
                    if(!vehicle.isAvailable){
                        System.out.println("Pojazd nie jest dostępny");
                        break;
                    }
                    System.out.println("Znaleziono pojazd: " + vehicle + ". Pojazd zostanie przypisany do nowego wypozyczenia.");
                    rentingVehicle = vehicle;
                    rentingVehicle.isAvailable = false;
                    found = true;
                }
            }

            if (!found)
                System.out.println("Nie znaleziono danego pojazdu.");
        }

        System.out.println("Podaj okres wypożyczenia w dniach:");
        numberOfDays = scanner.nextInt();

        this.rents.add(new Rent(rentingCustomer, rentingVehicle, LocalDate.now(), LocalDate.now().plusDays(numberOfDays)));


    }

    public void displayRents() {
        if (rents.isEmpty()) {
            System.out.println("Brak wypozyczen, lista pusta.");
        }
        else {
            for (Rent rent : rents) {
                System.out.println(rent.toString());
            }
        }
    }
    public void displayAvailableCars(){
        if (vehicles.isEmpty()) {
            System.out.println("Brak aut, lista pusta.");
        }
        else {
            for (Vehicle vehicle : vehicles) {
                if(vehicle.isAvailable)
                System.out.println(vehicle);
            }
        }
    }

    public void displayRentedCars(){
        if (vehicles.isEmpty()) {
            System.out.println("Brak aut, lista pusta.");
        }
        else {
            for (Vehicle vehicle : vehicles) {
                if(!vehicle.isAvailable)
                    System.out.println(vehicle);
            }
        }
    }
    public void displayOverdueReturnDate(){
        boolean found = false;
        if (rents.isEmpty()) {
            System.out.println("Brak wypozyczen, lista pusta.");
        }
        else {
            for (Rent rent : rents) {
                if (LocalDate.now().isAfter(rent.dateOfReturn)){
                    System.out.println(rent);
                    found = true;
                }
            }
        }

        if(!found) System.out.println("Brak zaległych wypożyczen.");


    }

}
