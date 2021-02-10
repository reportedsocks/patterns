package adapter_pattern;

import adapter_pattern.duck.Duck;
import adapter_pattern.duck.MallardDuck;
import adapter_pattern.turkey.WildTurkey;

public class TurkeyAdapterTest {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck wildTurkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("Duck says...");
        testDuck(duck);


        System.out.println("TurkeyAdapter says...");
        testDuck(wildTurkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
