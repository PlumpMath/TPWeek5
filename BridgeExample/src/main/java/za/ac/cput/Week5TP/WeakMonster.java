package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/12.
 */
public class WeakMonster extends Monster {

    int damage;

    public WeakMonster(Weapon weapon)
    {
        this.weapon = weapon;
        this.strength = 10;
    }


    @Override
    public int attack() {

        return strength + weapon.damage();

    }
}
