package se.iths.asli.ProjAssignment2;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> productList = new ArrayList<>();
    private UI ui;

    public ProductRepository(UI ui) {
        this.ui = ui;
    }

    //Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        String choice = ui.prompt("Please choose a category to add a product to\n" +
                "1. Figurines\n2. Pins\n3. Plushies\n4. Exit");
//        System.out.println("Please choose a category to add a product to");
//        System.out.println("1. Figurines\n2. Pins\n3. Plushies\n4. Exit");
        //String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                ui.info("You have chosen Figurines");
                String title = ui.prompt("Please enter the title for the figurine");
                int articleNumber = Integer.parseInt(ui.prompt("Please enter the article number"));
                double price = Double.parseDouble(ui.prompt("Please enter the price"));
                String description = ui.prompt("Please enter the description");
                productList.add(new Figurines(articleNumber, title, price, description));
                break;
//                System.out.println("You have chosen Figurines \n Please enter title for the figurine");
//                String title = scanner.nextLine();
//                System.out.println("Please enter article number");
//                int articleNumber = scanner.nextInt();
//                System.out.println("Please enter price");
//                double price = scanner.nextDouble();
//                scanner.nextLine();
//                System.out.println("Please enter description");
//                String description = scanner.nextLine();
            case "2":
                ui.info("You have chosen Pins");
                title = ui.prompt("Please enter the title for the pins\n");
                articleNumber = Integer.parseInt(ui.prompt("Please enter the article number"));
                price = Double.parseDouble(ui.prompt("Please enter the price"));
                description = ui.prompt("Please enter the description");
                productList.add(new Pins(articleNumber, title, price, description));
                break;
//                System.out.println("You have chosen Pins \n Please enter title for the pin");
//                title = scanner.nextLine();
//                System.out.println("Please enter article number");
//                articleNumber = scanner.nextInt();
//                System.out.println("Please enter price");
//                price = scanner.nextDouble();
//                scanner.nextLine();
//                System.out.println("Please enter description");
//                description = scanner.nextLine();
//                productList.add(new Pins(articleNumber, title, price, description));
            case "3":
                ui.info("You have chosen Plushies");
                title = ui.prompt("Please enter the title for the plush\n");
                articleNumber = Integer.parseInt(ui.prompt("Please enter the article number"));
                price = Double.parseDouble(ui.prompt("Please enter the price"));
                description = ui.prompt("Please enter the description");
                productList.add(new Plush(articleNumber, title, price, description));
                break;
//                System.out.println("You have chosen Plushies \n Please enter title for the plush");
//                title = scanner.nextLine();
//                System.out.println("Please enter article number");
//                articleNumber = scanner.nextInt();
//                System.out.println("Please enter price");
//                price = scanner.nextDouble();
//                scanner.nextLine();
//                System.out.println("Please enter description");
//                description = scanner.nextLine();
//                productList.add(new Plush(articleNumber, title, price, description));
//                break;
            case "4":
                break;
            default:
                ui.info("Invalid input. Please try again");
                break;
            //System.out.println("Invalid input. Please try again");
        }
        ui.info("Product has been added! Thank you!");
        //System.out.println("Product has been added! Thank you!");
    }

    public void getProductList() {
        ui.info("Here are all the products in our shop");
        for (Product currentProduct : productList) {
            String allInfo = "Item: " + currentProduct.getTitle() +
                    "\n -Category: " + currentProduct.category() +
                    "\n -Price: " + currentProduct.getPrice() +
                    "\n -Description: " + currentProduct.getDescription() +
                    "\n -Article Number: " + currentProduct.getArticleNumber();
            ui.info(allInfo);
        }
        //System.out.println("Here are all the products in our shop");
//        for (int i = 0; i < productList.size(); i++) {
//            Product currentProduct = productList.get(i);
//            System.out.println("Item: " + currentProduct.getTitle() +
//                    "\n -Category: " + currentProduct.category() +
//                    "\n -Price: " + currentProduct.getPrice() +
//                    "\n -Description: " + currentProduct.getDescription() +
//                    "\n -Article Number: " + currentProduct.getArticleNumber());
//        }
    }

    public void viewInfoOnProduct() {
        //System.out.println("Search for product by article number: ");
        int chosenProductArticleNum; //= scanner.nextInt();

        try {
            chosenProductArticleNum = Integer.parseInt(ui.prompt("Search for product by article number"));
        } catch (NumberFormatException e) {
            ui.info("No product with that article number was found");
            return;
        }
        boolean articleNumFound = false;

        for (Product chosenProduct : productList) {
            if (chosenProduct.getArticleNumber() == chosenProductArticleNum) {
                String productTotalInfo = "Item: " + chosenProduct.getTitle() +
                        "\n -Category: " + chosenProduct.category() +
                        "\n -Price: " + chosenProduct.getPrice() +
                        "\n -Description: " + chosenProduct.getDescription() +
                        "\n -Article number: " + chosenProduct.getArticleNumber();
                ui.info(productTotalInfo);
                articleNumFound = true;
            }
        }
        if (!articleNumFound) {
            ui.info("No product with that article number was found");
        }

//        for (int i = 0; i < productList.size(); i++) {
//            Product chosenProduct = productList.get(i);
//
//            if (chosenProduct.getArticleNumber() == chosenProductArticleNum) {
//                System.out.println("Item: " + chosenProduct.getTitle() +
//                        "\n -Category: " + chosenProduct.category() +
//                        "\n -Price: " + chosenProduct.getPrice() +
//                        "\n -Description: " + chosenProduct.getDescription() +
//                        "\n -Article number: " + chosenProduct.getArticleNumber());
//                articleNumFound = true;
//            }
//        }
//        if (!articleNumFound) {
//            System.out.println("No product with that article number was found");
//        }

    }

    public void saveProductToFile() {

    }
}
