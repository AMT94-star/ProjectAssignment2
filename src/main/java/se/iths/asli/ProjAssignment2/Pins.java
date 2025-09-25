package se.iths.asli.ProjAssignment2;

public class Pins extends Product {

    public Pins(int articleNumber, String title, double price, String description) {
        super(articleNumber, title, price, description);
    }

    @Override
    public String category() {
        return "Accessory";
    }
}
