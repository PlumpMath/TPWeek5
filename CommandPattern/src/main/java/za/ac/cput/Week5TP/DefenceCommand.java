package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class DefenceCommand implements Command{

    Defend defend;

    public DefenceCommand(Defend defend)
    {
        this.defend = defend;
    }

    @Override
    public void execute() {
        defend.doDefence();
    }
}