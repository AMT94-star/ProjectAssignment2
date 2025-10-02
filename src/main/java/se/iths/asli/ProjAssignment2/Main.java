package se.iths.asli.ProjAssignment2;

public class Main {
    public static void main(String[] args) {
        UI ui = new JOptionPaneUI();
        ProductRepository productRepository = new ProductRepository(ui);
        boolean running = true;
        //Scanner input = new Scanner(System.in);

        while (running) {
            String choice = ui.menu();
            //menu();
            if (choice == null) {
                break;
            }
            switch (choice /*input.nextLine()*/) {
                case "1":
                    //ui.info("Add product information here");
                    productRepository.addProduct();
                    break;
                case "2":
                    //ui.info("Listing all products");
                    productRepository.getProductList();
                    break;
                case "3":
                    ui.prompt("Search for product by article number: ");
                    productRepository.viewInfoOnProduct();
                    break;
                case "4":
                    ui.info("You have chosen to exit. Goodbye!");
                    //System.out.println("You have chosen to exit. Goodbye!");
                    running = false;
                    break;
                default:
                    ui.info("Invalid input. Please try again");
                    //System.out.println("Invalid input. Please try again");
            }
        }

    }

//    public static void menu() {
//        System.out.println("Welcome to my webshop, please choose an option");
//        System.out.println("1. Add product");
//        System.out.println("2. View all products");
//        System.out.println("3. View information about the product");
//        System.out.println("4.Exit");
//    }
}
