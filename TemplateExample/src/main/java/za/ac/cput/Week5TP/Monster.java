package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public abstract class Monster {

    public final String startMonster(){

        return getName() + " " + getType() + " " + getNoise();

    }

    public abstract String getName();
    public abstract String getType();
    public abstract String getNoise();



}
