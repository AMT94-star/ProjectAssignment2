package se.iths.asli.ProjAssignment2;

import java.util.Scanner;

public class Plush extends Product {
    Scanner scanner = new Scanner(System.in);

    public Plush(int articleNumber, String title, double price, String description) {
        super(articleNumber, title, price, description);
    }

    @Override
    public String category() {
        return "Toy";
    }
}
