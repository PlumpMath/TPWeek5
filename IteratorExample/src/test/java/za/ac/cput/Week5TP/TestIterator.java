package za.ac.cput.Week5TP;

import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Created by student on 2015/03/13.
 */
public class TestIterator extends TestCase {

    MonsterType m1,m2,m3;
    Monsterlist monsterlist;

    @Override
    public void setUp() throws Exception {
        m1 = new MonsterType("Zombie","Fast");
        m2 = new MonsterType("Mummy","Slow");
        m3 = new MonsterType("Skeleton","Invincible");
        monsterlist = new Monsterlist();

        monsterlist.addMonster(m1);
        monsterlist.addMonster(m2);
        monsterlist.addMonster(m3);


    }

    public void testIterator() throws Exception {

        System.out.println("Displaying Monsters:");
        Iterator<MonsterType> iterator = monsterlist.iterator();
        while (iterator.hasNext()) {
            MonsterType mon = iterator.next();
            System.out.println(mon);
        }


        iterator.remove();


        System.out.println("\nDisplaying Monsters:");
        iterator = monsterlist.iterator();
        while (iterator.hasNext()) {
            MonsterType mon = iterator.next();
            System.out.println(mon);
        }

        iterator.remove();

        System.out.println("\nDisplaying Monsters:");
        iterator = monsterlist.iterator();
        while (iterator.hasNext()) {
            MonsterType mon = iterator.next();
            System.out.println(mon);
        }



    }
}
