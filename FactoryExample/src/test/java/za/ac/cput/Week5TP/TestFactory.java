package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/07.
 */
public class TestFactory extends TestCase{


    MonsterFactory factory;
    Monster zombie;
    Monster mummy;


    @Override
    public void setUp() throws Exception {
        factory = MonsterFactory.getInstance();
        zombie = factory.getMonster("Drone");
        mummy = factory.getMonster("");
    }

    public void testFactory(){

        assertTrue(zombie.makeNoise() == "Drone");
        assertTrue(mummy.makeNoise() == "Mum");

    }
}
