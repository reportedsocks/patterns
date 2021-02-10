package composite_pattern;

import composite_pattern.menus.MenuComponent;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void print() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        for (Iterator<MenuComponent> it = allMenus.createIterator(); it.hasNext(); ) {
            MenuComponent menuComponent = it.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}
