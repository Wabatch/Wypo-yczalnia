package com.andrzejnowiczenko;

import java.util.List;
import java.util.Scanner;

public class CustomerUtils {
    public static Customer enterCustomer(){
        System.out.println("podaj imie i nazwisko");
        Scanner scanner = new Scanner(System.in);
        return new Customer(scanner.nextLine());
    }
}
