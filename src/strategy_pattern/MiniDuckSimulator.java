package strategy_pattern;

import strategy_pattern.base.Duck;
import strategy_pattern.behavior.fly.FlyRocketPowered;
import strategy_pattern.ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        /*Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();*/

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
