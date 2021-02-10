package strategy_pattern.ducks;

import strategy_pattern.base.Duck;
import strategy_pattern.behavior.fly.FlyNoWay;
import strategy_pattern.behavior.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
