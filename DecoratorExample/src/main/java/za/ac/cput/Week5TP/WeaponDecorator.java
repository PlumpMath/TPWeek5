package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class WeaponDecorator extends MonsterDecorator {

    public WeaponDecorator(Monster monster)
    {
        super(monster);
    }


    @Override
    public String describe() {
        return "this is a weapon " + attack();
    }

    public String attack()
    {
        return "Attack";
    }
}
