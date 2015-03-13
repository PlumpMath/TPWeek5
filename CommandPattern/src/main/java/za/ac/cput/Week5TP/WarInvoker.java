package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class WarInvoker {

    Command command;

    public WarInvoker(Command command)
    {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke()
    {
        command.execute();
    }
}
