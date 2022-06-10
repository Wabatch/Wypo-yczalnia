package com.andrzejnowiczenko;

import java.io.*;
import java.util.Scanner;

public class Main {

    CarRental carRental = new CarRental();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        CarRental carRental = new CarRental();
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int option;


        System.out.println(carRental.customers.toString());

        do {
            main.displayMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1 ->
                        main.customerMenu();
                case 2 ->
                        main.vehicleMenu();
                case 3 ->
                        main.rentalMenu();
                case 4 ->
                        main.save();
                case 5 ->
                        main.load();
                case 6 ->
                        option = 0;
                default ->
                        System.out.println("Brak opcji.");
                }
        }while (option != 0);
    }



    private void displayMenu(){
        System.out.println("Menu:");
        System.out.println("1. Klienci");
        System.out.println("2. Pojazdy");
        System.out.println("3. Wypożyczenia");
        System.out.println("4. Zapis do pliku");
        System.out.println("5. Odczyt z pliku");
        System.out.println("6. Wyjście");
    }
    private void customerMenu(){
        System.out.println("Klienci:");
        System.out.println("1. Dodaj");
        System.out.println("2. Usuń");
        System.out.println("3. Wyszukaj");
        System.out.println("4. Przeglądaj wszystkich");

        int option = scanner.nextInt();

        switch (option) {
            case 1 ->
                    carRental.addCustomer();
            case 2 ->
                    carRental.removeCustomer();
            case 3 ->
                    carRental.searchCustomers();
            case 4 ->
                    carRental.displayCustomers();
        }
    }

    private void vehicleMenu(){
        System.out.println("Pojazdy:");
        System.out.println("1. Dodaj");
        System.out.println("2. Usuń");
        System.out.println("3. Wyszukaj");
        System.out.println("4. Przeglądaj wszystkie pojazdy");

        int option = scanner.nextInt();

        switch (option) {
            case 1 ->
                    addVehicleMenu();
            case 2 ->
                    carRental.removeVehicle();
            case 3 ->
                    carRental.searchVehicle();
            case 4 ->
                    carRental.displayVehicles();
        }
    }

    private void addVehicleMenu() {
        System.out.println("Jaki pojazd chcesz dodać?:");
        System.out.println("1. Samochód osobowy");
        System.out.println("2. Motor");
        System.out.println("3. Ciężarówka");

        int option = scanner.nextInt();

            switch (option) {
                case 1 ->
                    carRental.vehicles.add(Car.newCar());
                case 2 ->
                    carRental.vehicles.add(Motorcycle.newMotorcycle());
                case 3 ->
                    carRental.vehicles.add(Truck.newTruck());
            }
    }

    private void rentalMenu() {
        System.out.println("Menu wypozyczen:");
        System.out.println("1. Dodaj wypozyczenie");
        System.out.println("2. Przeglad wypozyczen");
        System.out.println("3. Dostepne pojazdy");
        System.out.println("4. Wypozyczone pojazdy");
        System.out.println("5. Zalegly termin zwrotu");

        int option = scanner.nextInt();

        switch (option) {
            case 1 ->
                    carRental.addRent();
            case 2 ->
                    carRental.displayRents();
            case 3 ->
                    carRental.displayAvailableCars();
            case 4 ->
                    carRental.displayRentedCars();
            case 5 ->
                    carRental.displayOverdueReturnDate();

        }
    }

    private void save() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("zapis.dat"));
        out.writeObject(carRental);
        out.close();
    }

    private void load() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("zapis.dat"));
        carRental = (CarRental) in.readObject();
        in.close();
    }


}
