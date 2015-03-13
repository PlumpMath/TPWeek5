package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/12.
 */
public class testProxy extends TestCase {


    Proxy proxy;
    QuickMonster quickMonster;

    public void setUp() throws Exception {

        proxy = new Proxy();
        quickMonster = new QuickMonster();
    }

    public void testProxy() throws Exception {


        quickMonster.groan();
        proxy.groan();

    }
}
