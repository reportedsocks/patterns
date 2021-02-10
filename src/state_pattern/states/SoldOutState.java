package state_pattern.states;

import state_pattern.GumballMachine;

public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert, machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, machine is sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can't turn, machine is sold out");
    }

    @Override
    public void dispense() {
        System.out.println("Can't dispense, machine is sold out");
    }
}
