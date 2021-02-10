package iterator_pattern;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("1", true, .99);
        addItem("2", false, 3.99);
    }

    public void addItem(String description, boolean isVegetarian, double price) {
        menuItems.add(new MenuItem(description, isVegetarian, price));
    }

    public PancakeMenuIterator getIterator() {
        return new PancakeMenuIterator(menuItems);
    }
}
