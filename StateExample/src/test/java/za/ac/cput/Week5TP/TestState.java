package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/13.
 */
public class TestState extends TestCase {

    Monster mon;

    @Override
    public void setUp() throws Exception {

        mon = new Monster(new AgrrovatedState());
    }

    public void testState() throws Exception {

        assertEquals(mon.greet(), "Grrr");
        assertEquals(mon.leave(), "Run");

        mon.setCurrentState(new CalmState());

        assertEquals(mon.greet(), "Hello");
        assertEquals(mon.leave(), "Bye");
    }
}
