package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/07.
 */
public class MonsterDirector {

    private MonsterBuilder monBuild = null;

    public MonsterDirector(MonsterBuilder monBuild)
    {
        this.monBuild = monBuild;
    }

    public void constructMonsters()
    {
        monBuild.buildName();
        monBuild.buildSpeed();
        monBuild.buildStrength();
        monBuild.buildIntel();
    }

    public Monster getMonster()
    {
        return monBuild.getMon();
    }
}
