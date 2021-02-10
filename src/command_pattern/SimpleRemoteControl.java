package command_pattern;

import command_pattern.commands.Command;

public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
