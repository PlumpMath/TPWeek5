package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/13.
 */
public class TestObserver extends TestCase{

    PhotoStudio studio;
    Observer1 obs1;
    Observer2 obs2;


    @Override
    public void setUp() throws Exception {

        studio = new PhotoStudio("green");
        obs1 = new Observer1();
        obs2 = new Observer2();

        studio.addObserver(obs1);
        studio.addObserver(obs2);

    }


    public void testObserver() throws Exception {

        studio.setNewColour("Red");
        studio.removeObserver(obs1);
        studio.setNewColour("green");

    }
}
