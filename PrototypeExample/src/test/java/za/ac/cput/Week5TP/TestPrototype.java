package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/07.
 */
public class TestPrototype extends TestCase{


    Human human1,human2;
    Monster monster1,monster2;

    @Override
    public void setUp() throws Exception {
        human1 = new Human("Bob","male",25);
        human2 = (Human) human1.doClone();

        monster1 = new Monster("Zombie",5,10);
        monster2 = (Monster) monster1.doClone();



    }


    public void testPrototype() throws Exception {

        assertEquals(monster1.toString(),monster2.toString());
        assertEquals(human1.toString(),human2.toString());


    }
}
