package command_pattern.devices;

public class Stereo {
    public void on() {
        System.out.println("Turning stereo on");
    }
    public void off() {
        System.out.println("Turning stereo off");
    }
    public void setCD() {
        System.out.println("Set CD to stereo");
    }
    public void setDVD() {
        System.out.println("Set DVD to stereo");
    }
    public void setVolume(int volume) {
        System.out.println("Set volume to " + volume);
    }
}
