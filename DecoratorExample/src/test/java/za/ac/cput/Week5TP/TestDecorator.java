package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/13.
 */
public class TestDecorator extends TestCase{


    Monster monster;

    @Override
    public void setUp() throws Exception {

        monster = new ActiveMonster();
    }

    public void testDecorator() throws Exception {

        assertEquals(monster.describe(), "I am a monster");

        monster = new WeaponDecorator(monster);
        assertEquals(monster.describe(), "this is a weapon Attack");

        monster = new ArmourDecorator(monster);
        assertEquals(monster.describe(), "I have armour now block");
    }
}
