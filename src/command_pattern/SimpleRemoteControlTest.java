package command_pattern;

import command_pattern.commands.Command;
import command_pattern.commands.LightOnCommand;
import command_pattern.devices.Light;

public class SimpleRemoteControlTest {
    public static  void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        Command command = new LightOnCommand(light);
        remote.setCommand(command);
        remote.buttonWasPressed();
    }
}
