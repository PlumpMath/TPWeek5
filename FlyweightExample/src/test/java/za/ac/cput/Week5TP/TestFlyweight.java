package za.ac.cput.Week5TP;

import junit.framework.TestCase;

import java.util.Date;

/**
 * Created by student on 2015/03/12.
 */
public class TestFlyweight extends TestCase {



    FlyweightFactory fact;
    Flyweight flyweightZombie;
    Flyweight flyweightMummy;

    @Override
    public void setUp() throws Exception {

        System.out.println(new Date());
        fact = FlyweightFactory.getInstance();

        flyweightZombie = fact.getFlyweight("groan");
        flyweightMummy = fact.getFlyweight("Hummmm");

    }

    public void testFlyweight() throws Exception {


        assertEquals(flyweightZombie.getNoise(), "groan");
        assertEquals(flyweightMummy.getNoise(), "Hummmm");
        flyweightZombie = fact.getFlyweight("groan");
        flyweightMummy = fact.getFlyweight("Hummmm");
        System.out.println(new Date());

    }
}
