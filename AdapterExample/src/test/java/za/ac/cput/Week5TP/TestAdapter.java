package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/11.
 */
public class TestAdapter extends TestCase{

    AngleInfo info;
    AngleInfo info2;

    public void setUp() throws Exception {
        info = new AngleClassReporter();
        info2 = new AngleObjectReporter();

    }


    public void testAdapter1() throws Exception {


        info.setAngleInDegrees(20);
        assertEquals(info.getAngleInDegrees(), 20);
        assertEquals(info.getAngleInRadions(), 10);


        info.setAngleInRadions(100);
        assertEquals(info.getAngleInDegrees(), 200);
        assertEquals(info.getAngleInRadions(), 100);
    }

    public void testAdapter2() throws Exception {
        info2.setAngleInDegrees(20);
        assertEquals(info2.getAngleInDegrees(), 20);
        assertEquals(info2.getAngleInRadions(), 10);


        info2.setAngleInRadions(100);
        assertEquals(info2.getAngleInDegrees(), 200);
        assertEquals(info2.getAngleInRadions(), 100);

    }
}
