package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public abstract class MonsterHandler {

    MonsterHandler monsterHandler;

    public void setMonsterHandler(MonsterHandler monsterHandler)
    {
        this.monsterHandler = monsterHandler;
    }

    public abstract String handleRequest(MonsterEnum request);
}
