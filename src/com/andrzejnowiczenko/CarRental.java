package com.andrzejnowiczenko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRental {

    Scanner scanner = new Scanner(System.in);

    List<Customer> customers = new ArrayList<>();
    List<Vehicle> vehicles = new ArrayList<>();
    List<Rent> rents = new ArrayList<>();

    public void addCustomer(Customer customer){
        System.out.println("podaj imie i nazwisko");

        customers.add(new Customer(scanner.nextLine()));
    }

    public void removeCustomer(){
        displayCusomers();

        int nr = scanner.nextInt();
        customers.set(nr - 1, null);
    }

    private void displayCusomers(){
        for(Customer customer: customers){
            System.out.println(customer.toString());
        }
    }

    private void enterVehicle(Vehicle vh){
        vehicles.add(vh);
    }

}
