package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/12.
 */
public class Bigweapon implements Weapon {

    int damage;

    public Bigweapon()
    {
        damage = 100;
    }

    @Override
    public int damage() {
        return damage;
    }
}
