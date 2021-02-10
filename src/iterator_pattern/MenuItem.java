package iterator_pattern;

public class MenuItem {
    private String description;
    private boolean isVegetarian;
    private double price;

    public MenuItem(String description, boolean isVegetarian, double price) {
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getPrice() {
        return price;
    }
}
