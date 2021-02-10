package state_pattern.states;

import state_pattern.GumballMachine;

public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("We are already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, we are already giving you a gumball");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can't get 2 balls");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        int count = gumballMachine.getCount();
        if (count > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops no balls left");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
