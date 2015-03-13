package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/12.
 */
public class TestFacade extends TestCase{

    Facade facade;
    int t1,t2,t3;

    @Override
    public void setUp() throws Exception {

        facade = new Facade();
        t1 = facade.rollOneDie();
        t2 = facade.rollTwoDie();
        t3 = facade.rollFourDie();
    }

    public void testFacade() throws Exception {


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        assertTrue(t1 > 0 && t1 < 7);
        assertTrue(t2 > 2 && t2 < 13);
        assertTrue(t3> 4 && t3 < 25);




    }
}
