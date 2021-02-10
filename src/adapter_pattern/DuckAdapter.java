package adapter_pattern;

import adapter_pattern.duck.Duck;
import adapter_pattern.turkey.Turkey;

public class DuckAdapter implements Turkey {

    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
        System.out.println("Flying back 4/5 of the distance");
    }
}
