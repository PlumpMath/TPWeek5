package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/12.
 */
public class StrongMonster extends Monster {

    public StrongMonster(Weapon weapon)
    {
        this.weapon = weapon;
        this.strength = 50;
    }


    @Override
    public int attack() {
        return strength + weapon.damage();
    }
}
