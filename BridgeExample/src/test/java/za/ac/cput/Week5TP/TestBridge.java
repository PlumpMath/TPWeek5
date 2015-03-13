package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/13.
 */
public class TestBridge extends TestCase {

    Monster strongMonster1,strongMonster2,weakMonster1,weakMonster2;

    @Override
    public void setUp() throws Exception {

        strongMonster1 = new StrongMonster(new Bigweapon());
        strongMonster2 = new StrongMonster(new SmallWeapon());
        weakMonster1 = new WeakMonster(new Bigweapon());
        weakMonster2 = new WeakMonster(new SmallWeapon());
    }

    public void testBridge() throws Exception {

        assertEquals(strongMonster1.attack(),150);
        assertEquals(strongMonster2.attack(),60);
        assertEquals(weakMonster1.attack(),110);
        assertEquals(weakMonster2.attack(),20);
    }
}
