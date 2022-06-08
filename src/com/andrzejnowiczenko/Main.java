package com.andrzejnowiczenko;

import java.util.Scanner;

public class Main {

    CarRental carRental = new CarRental();


    public static void main(String[] args) {
        CarRental carRental = new CarRental();
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int option;


        System.out.println(carRental.customers.toString());


        do {
            main.displayMenu();
            option = scanner.nextInt();
            switch (option) {

            }
        }while (option != 0);


    }


    private void displayMenu(){
        System.out.println("Menu:");
        System.out.println("1. Klienci");
        System.out.println("2. Pojazdy");
        System.out.println("3. Wypożyczenia");
        System.out.println("0. Wyjście");
        System.out.println("> ");
    }
    private void customerMenu(){
        System.out.println("Klienci:");
        System.out.println("1. Dodaj");
        System.out.println("2. Usuń");
        System.out.println("3. Wyszukaj");
        System.out.println("4. Przeglądaj wszystkich");
    }
    private void vehicleMenu(){
        System.out.println("Pojazdy:");
        System.out.println("1. Dodaj");
        System.out.println("2. Usuń");
        System.out.println("3. Wyszukaj");
        System.out.println("4. Przeglądaj wszystkie pojazdy");
    }
    private void addVehicleMenu() {
        System.out.println("Jaki pojazd chcesz dodać?:");
        System.out.println("1. Samochód osobowy");
        System.out.println("2. Motor");
        System.out.println("3. Ciężarówka");


        String option;

        do {
            Scanner scanner = new Scanner(System.in);

            option = scanner.next();

            switch (option) {
                case "1":
                    carRental.vehicles.add(Car.newCar());

                    break;
                case "2":
                    

                    break;
                case "3":

                    break;

            }
        } while (!"w".equals(option));
    }
}
