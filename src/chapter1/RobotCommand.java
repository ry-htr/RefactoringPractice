package chapter1;

public class RobotCommand {
    private final String _name;

    public RobotCommand(String name) {
        _name = name;
    }

    @Override public String toString() {
        return "[ RobotCommand: " + _name + " ]";
    }
}
