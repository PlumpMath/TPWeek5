package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/13.
 */
public class TestStratagy extends TestCase{


    int distance;
    Stratagy runStrat,walkStrat;
    Context context;


    @Override
    public void setUp() throws Exception {
        distance = 90;
        runStrat = new RunStratagy();
        walkStrat = new WalkStratagy();

        context = new Context(distance,runStrat);
    }

    public void testStratagy() throws Exception {

        assertTrue(context.getResult());
        context.setStratagy(walkStrat);
        assertFalse(context.getResult());
    }
}
