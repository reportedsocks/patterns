package strategy_pattern.ducks;

import strategy_pattern.base.Duck;
import strategy_pattern.behavior.fly.FlyWithWings;
import strategy_pattern.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a MallardDuck");
    }
}
