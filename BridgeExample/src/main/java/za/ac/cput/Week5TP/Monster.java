package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/12.
 */
public abstract class Monster {

    Weapon weapon;
    int strength;

    public abstract int attack();

    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }


}
