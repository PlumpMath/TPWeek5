package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class ArmourDecorator extends MonsterDecorator {

    public ArmourDecorator(Monster monster)
    {
        super(monster);
    }

    @Override
    public String describe() {
        return "I have armour now " + block();
    }

    public String block()
    {
        return "block";
    }
}
