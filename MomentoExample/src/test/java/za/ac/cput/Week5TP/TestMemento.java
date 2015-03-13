package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/13.
 */
public class TestMemento extends TestCase {

    MonsterInfoCaretaker monsterInfoCaretaker;
    MonsterInfo monsterInfo;

    @Override
    public void setUp() throws Exception {
        monsterInfoCaretaker = new MonsterInfoCaretaker();
        monsterInfo = new MonsterInfo("Zombie","Fast", 1);

    }

    public void testMemento() throws Exception {

        System.out.println(monsterInfo);

        monsterInfo.setMonsterName("Mummy");
        System.out.println(monsterInfo);

        System.out.println("\n Saving");
        monsterInfoCaretaker.saveState(monsterInfo);

        monsterInfo.setMonsterName("Wolf");
        System.out.println(monsterInfo);

        monsterInfo.setMonsterName("Skeleton");
        System.out.println(monsterInfo);

        System.out.println("\nRestoring info");
        monsterInfoCaretaker.restoreState(monsterInfo);
        System.out.println(monsterInfo);


    }
}
