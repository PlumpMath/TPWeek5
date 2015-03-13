package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class AttackCommand implements Command{

    Attack attack;

    public AttackCommand(Attack attack)
    {
        this.attack = attack;
    }

    @Override
    public void execute() {
        attack.doAttack();
    }
}
