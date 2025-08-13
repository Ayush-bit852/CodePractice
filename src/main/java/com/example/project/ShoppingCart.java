package com.example.project;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        //Shopping cart Program
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy? : ");
        item = scanner.nextLine();

        System.out.print("WHat is the price for each : ");
        price = scanner.nextDouble();

        System.out.print("What is the quantity :");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("Your Total is " + currency +" "+ total + " Give it to the cashier");
        scanner.close();
    }
}
