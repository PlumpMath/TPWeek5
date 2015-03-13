package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/12.
 */
public class SmallWeapon implements Weapon {

    int damage;

    public SmallWeapon()
    {
        damage = 10;
    }

    @Override
    public int damage() {
        return damage;
    }
}
