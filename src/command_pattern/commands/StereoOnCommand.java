package command_pattern.commands;

import command_pattern.devices.Light;
import command_pattern.devices.Stereo;

public class StereoOnCommand implements Command{

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(47);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
