package strategy_pattern.behavior.fly;

import strategy_pattern.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly :(");
    }
}
