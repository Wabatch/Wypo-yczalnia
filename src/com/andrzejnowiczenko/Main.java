package com.andrzejnowiczenko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    List<Customer> customers = new ArrayList<>();
    List<Vehicle> vehicles = new ArrayList<>();
    List<Rent> rents = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        displayMenu();

        do {
            option = scanner.nextInt();
            switch (option) {
                
            }
        }while (option != 0);


    }

    private static void displayMenu(){
        System.out.println("Menu:");
        System.out.println("1. Klienci");
        System.out.println("2. Pojazdy");
        System.out.println("3. Wypożyczenia");
        System.out.println("0. Wyjście");
    }
}
