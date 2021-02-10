package state_pattern.states;

import state_pattern.GumballMachine;

public class WinnerState implements State {

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        System.out.println("YOU ARE A WINNER!!! You get 2 gumballs");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0 ) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0 ) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops no balls left");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
