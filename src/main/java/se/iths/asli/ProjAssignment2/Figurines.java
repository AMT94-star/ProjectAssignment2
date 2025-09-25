package se.iths.asli.ProjAssignment2;

public class Figurines extends Product {

    public Figurines(int articleNumber, String title, double price, String description) {
        super(articleNumber, title, price, description);
    }

    @Override
    public String category() {
        return "Decor";
    }
}
