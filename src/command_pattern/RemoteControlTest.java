package command_pattern;

import command_pattern.commands.*;
import command_pattern.devices.Light;
import command_pattern.devices.Stereo;

public class RemoteControlTest {
    public static  void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        remote.setCommand(1, lightOnCommand, lightOffCommand);

        Stereo stereo = new Stereo();
        Command stereoOnCommand = new StereoOnCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);
        remote.setCommand(2, stereoOnCommand, stereoOffCommand);


        Command[] partyOnCommands = {lightOnCommand, stereoOnCommand};
        Command[] partyOffCommands = {lightOffCommand, stereoOffCommand};
        MacroCommand partyOn = new MacroCommand(partyOnCommands);
        MacroCommand partyOff = new MacroCommand(partyOffCommands);
        remote.setCommand(3, partyOn, partyOff);

        System.out.println(remote);

        remote.onButtonPressed(3);
        remote.offButtonPressed(3);
        /*remote.onButtonPressed(1);
        remote.undoButtonPressed();
        remote.onButtonPressed(1);
        remote.onButtonPressed(2);
        remote.undoButtonPressed();*/
        /*remote.onButtonPressed(3);

        remote.offButtonPressed(1);
        remote.offButtonPressed(2);
        remote.offButtonPressed(3);*/
    }
}
