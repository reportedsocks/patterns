package decorator_pattern.coffee_shop;

import decorator_pattern.coffee_shop.coffee.Espresso;
import decorator_pattern.coffee_shop.coffee.HouseBlend;
import decorator_pattern.coffee_shop.decorators.Mocha;
import decorator_pattern.coffee_shop.decorators.Soy;
import decorator_pattern.coffee_shop.decorators.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
