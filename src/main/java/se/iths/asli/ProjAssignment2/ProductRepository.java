package se.iths.asli.ProjAssignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository {
    private List<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Please choose a category to add a product to");
        System.out.println("1. Figurines");
        System.out.println("2. Pins");
        System.out.println("3. Plushies");
        System.out.println("4. Exit");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You have chosen Figurines \n Please enter title for the figurine");
                String title = scanner.nextLine();
                System.out.println("Please enter article number");
                int articleNumber = scanner.nextInt();
                System.out.println("Please enter price");
                double price = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Please enter description");
                String description = scanner.nextLine();
                productList.add(new Figurines(articleNumber, title, price, description));
                break;
            case "2":
                System.out.println("You have chosen Pins \n Please enter title for the pin");
                title = scanner.nextLine();
                System.out.println("Please enter article number");
                articleNumber = scanner.nextInt();
                System.out.println("Please enter price");
                price = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Please enter description");
                description = scanner.nextLine();
                productList.add(new Pins(articleNumber, title, price, description));
                break;
            case "3":
                System.out.println("You have chosen Plushies \n Please enter title for the plush");
                title = scanner.nextLine();
                System.out.println("Please enter article number");
                articleNumber = scanner.nextInt();
                System.out.println("Please enter price");
                price = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Please enter description");
                description = scanner.nextLine();
                productList.add(new Plush(articleNumber, title, price, description));
                break;
            case "4":
                break;
            default:
                System.out.println("Invalid input. Please try again");
        }
        System.out.println("Product has been added! Thank you!");
    }

    public void getProductList() {
        System.out.println("Here are all the products in our shop");
        for (int i = 0; i < productList.size(); i++) {
            Product currentProduct = productList.get(i);
            System.out.println("Item: " + currentProduct.getTitle() +
                    "\n -Category: " + currentProduct.category() +
                    "\n -Price: " + currentProduct.getPrice() +
                    "\n -Description: " + currentProduct.getDescription() +
                    "\n -Article Number: " + currentProduct.getArticleNumber());
        }
    }

    public void viewInfoOnProduct() {
        System.out.println("Search for product by article number: ");
        int chosenProductNumber = scanner.nextInt();

        for (int i = 0; i < productList.size(); i++) {
            Product chosenProduct = productList.get(i);
            if (productList.get(i).getArticleNumber() == chosenProductNumber) {
                System.out.println("Item: " + chosenProduct.getTitle() +
                        "\n -Category: " + chosenProduct.category() +
                        "\n -Price: " + chosenProduct.getPrice() +
                        "\n -Description: " + chosenProduct.getDescription() +
                        "\n -Article number: " + chosenProduct.getArticleNumber());
            } else {
                System.out.println("No product with that article number was found");
                //the else if gets triggered when choosing the first and second options?
                //Whenever something gets added the previous option gets the above message
                //added to it
            }
        }

    }
}
