package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/07.
 */
public class TestSingleton extends TestCase {

    SingletonExample example,example2;


    @Override
    public void setUp(){

        example = SingletonExample.getInstance();
        example2 = SingletonExample.getInstance();
    }

    public void testSingleton(){
        assertTrue(example.hashCode() == example2.hashCode());

    }
}
