package se.iths.asli.ProjAssignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        boolean running = true;
        Scanner input = new Scanner(System.in);
        
        while (running) {
            menu();
            switch (input.nextLine()) {
                case "1":
                    productRepository.addProduct();
                    break;
                case "2":
                    productRepository.getProductList();
                    break;
                case "3":
                    productRepository.viewInfoOnProduct();
                    break;
                case "4":
                    System.out.println("You have chosen to exit. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input. Please try again");
            }
        }

    }

    public static void menu() {
        System.out.println("Welcome to my webshop, please choose an option");
        System.out.println("1. Add product");
        System.out.println("2. View all products");
        System.out.println("3. View information about the product");
        System.out.println("4.Exit");
    }
}
