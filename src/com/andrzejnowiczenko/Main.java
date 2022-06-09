package com.andrzejnowiczenko;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    CarRental carRental = new CarRental();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

       /*
                    JAK ZROBIC DATE NO

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        String xxx = scanner.nextLine();
        Date data = formatter.parse(xxx);
        System.out.println(data);
        */

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
                        option = 0;
                default ->
                        System.out.println("Brak opcji.");
                }
        }while (option != 0);
    }

                    //całe menu pod spodem, trzeba to przerzucic do klasy menu zeby byl porzadeczek okuratnie wzgledny jakis

    private void displayMenu(){
        System.out.println("Menu:");
        System.out.println("1. Klienci");
        System.out.println("2. Pojazdy");
        System.out.println("3. Wypożyczenia");
        System.out.println("4. Wyjście");
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

      /*  switch (option) {
            case 1 ->

            case 2 ->

            case 3 ->

            case 4 ->

            case 5 ->
        }
       */
    }
}
