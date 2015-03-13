package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public abstract class MonsterDecorator implements Monster {

    Monster monster;

    public MonsterDecorator(Monster monster)
    {
        this.monster = monster;
    }


}
