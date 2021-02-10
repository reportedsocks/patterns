package command_pattern.commands;

public class NoCommand implements Command {

    public NoCommand() {}

    @Override
    public void execute() {
        System.out.println("No command");
    }

    @Override
    public void undo() {
        System.out.println("No command");
    }
}
