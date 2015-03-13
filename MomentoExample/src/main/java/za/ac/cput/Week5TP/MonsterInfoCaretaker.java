package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class MonsterInfoCaretaker {
    Object objMemento;

    public void saveState(MonsterInfo monsterInfo)
    {
        objMemento = monsterInfo.save();
    }

    public void restoreState(MonsterInfo monsterInfo)
    {
        monsterInfo.restore(objMemento);
    }
}
