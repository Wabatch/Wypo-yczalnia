package com.andrzejnowiczenko;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CarRental {

    Scanner scanner = new Scanner(System.in);

    List<Customer> customers = new ArrayList<>();
    List<Vehicle> vehicles = new ArrayList<>();
    List<Rent> rents = new ArrayList<>();

                        // dodaj,usun,wyswietl klientow

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
                System.out.println(customer.toString());
                found = true;
            }
        }

        if (found == false)
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
                System.out.println(vehicle.toString());
                found = true;
            }
        }

        if (found == false)
            System.out.println("Nie znaleziono danego modelu.");
    }

    public void removeVehicle(){
        displayVehicles();

        int nr = scanner.nextInt();
        vehicles.set(nr-1, null);
    }

    public void addRent() {

        int ID = scanner.nextInt();
        boolean found = false;
        Customer rentingCustomer;
        Vehicle rentingVehicle;

        System.out.println("Podaj ID klienta:");
        for (Customer customer: customers){
            if (customer.getId()==ID) {
                System.out.println("Znaleziono dane klienta: "+customer.toString()+". Klient zostanie przypisany do nowego wypozyczenia.");
                rentingCustomer = customer;
                found = true;
            }
        }

        if (found == false)
            System.out.println("Nie znaleziono danego klienta.");

        found = false;
        System.out.println("Podaj ID pojazdu:");
        for (Vehicle vehicle: vehicles) {
            System.out.println("Znaleziono pojazd: "+vehicle.toString()+". Pojazd zostanie przypisany do nowego wypozyczenia.");
            rentingVehicle = vehicle;
            found = true;
        }

        System.out.println("Ustalanie daty zwrotu wypozyczenia (format: yyyy-MM-dd):");
    }

}
