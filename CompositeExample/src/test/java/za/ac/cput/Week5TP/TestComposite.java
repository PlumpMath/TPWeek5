package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/11.
 */
public class TestComposite extends TestCase {



    Minion min1;
    Minion min2;
    Minion min3;
    Minion min4;
    Minion min5;
    Composite comp1;
    Composite comp2;
    Composite comp3;

    public void setUp() throws Exception {

        min1 = new Minion("Zombie", "groan");
        min2 = new Minion("Mummy", "Mum");
        min3 = new Minion("Dog", "bark");
        min4 = new Minion("Lizard", "hiss");
        min5 = new Minion("Bug", "buzz");

        comp1 = new Composite();
        comp2 = new Composite();
        comp3 = new Composite();

        comp1.add(min1);
        comp1.add(min2);

        comp2.add(min3);
        comp2.add(min4);

        comp3.add(comp1);
        comp3.add(comp2);
        comp3.add(min5);

    }

    public void testComposite() throws Exception {

        comp1.sayName();
        System.out.println("");
        comp2.sayName();
        System.out.println("");
        comp3.sayName();
        System.out.println("");
        comp3.growl();




    }
}
