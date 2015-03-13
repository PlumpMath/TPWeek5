package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/13.
 */
public class TestCommand extends TestCase {

    Attack attack;
    Defend defend;
    Command attackCommand,defendCommand;
    WarInvoker warInvoker;


    @Override
    public void setUp() throws Exception {

        attack = new Attack();
        attackCommand = new AttackCommand(attack);
        defend = new Defend();
        defendCommand = new DefenceCommand(defend);

        warInvoker = new WarInvoker(attackCommand);

    }

    public void testCommand() throws Exception {

        warInvoker.invoke();
        warInvoker.setCommand(defendCommand);
        warInvoker.invoke();

    }
}
