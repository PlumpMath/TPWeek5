package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class MonsterInfo {

    String monsterName;
    String monsterType;
    int monsterStrength;

    public MonsterInfo(String monsterName, String monsterType, int monsterStrength)
    {
        this.monsterName = monsterName;
        this.monsterType = monsterType;
        this.monsterStrength = monsterStrength;
    }

    public String toString()
    {
        return "Name: " + monsterName + " Type: " + monsterType + " Strength: " + monsterStrength;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public void setMonsterStrength(int monsterStrength) {
        this.monsterStrength = monsterStrength;
    }

    public Memento save()
    {
        return new Memento(monsterName, monsterType, monsterStrength);
    }

    public void restore(Object objMomento)
    {
        Memento memento = (Memento)objMomento;
        monsterName = memento.mementoMonsterName;
        monsterType = memento.mementoMonsterType;
        monsterStrength = memento.mementoMonsterStrength;
    }

    //_____________________________________________________________________

    private class Memento
    {
        String mementoMonsterName;
        String mementoMonsterType;
        int mementoMonsterStrength;

        public Memento(String monsterName, String monsterType, int monsterStrength)
        {
            mementoMonsterName = monsterName;
            mementoMonsterType = monsterType;
            mementoMonsterStrength = monsterStrength;
        }
    }
}
