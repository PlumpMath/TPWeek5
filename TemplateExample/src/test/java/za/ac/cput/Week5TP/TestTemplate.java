package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/13.
 */
public class TestTemplate extends TestCase{

    Monster mon1,mon2;

    public void setUp() throws Exception {

        mon1 = new BigMonster();
        mon2 = new SmallMonster();

    }

    public void testTemplate() throws Exception {

        assertEquals(mon1.startMonster(), "bigMonster strong Roar");
        assertEquals(mon2.startMonster(), "small Monster weak yelp");
    }
}
