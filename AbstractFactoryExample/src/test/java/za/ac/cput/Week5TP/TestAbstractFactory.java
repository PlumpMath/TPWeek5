package za.ac.cput.Week5TP;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Week5TP.AbstractFactory.AbstractFactory;
import za.ac.cput.Week5TP.HumanFactory.HumanFactory;
import za.ac.cput.Week5TP.HumanoidFactory.Humanoid;
import za.ac.cput.Week5TP.HumanoidFactory.HumanoidFactory;
import za.ac.cput.Week5TP.MonsterFactory.MonsterFactory;

/**
 * Created by student on 2015/03/07.
 */
public class TestAbstractFactory extends TestCase{

    AbstractFactory abstractFact;
    HumanoidFactory humanFact;
    Humanoid a1,a2,a3,a4;


    @Before
    public void setUp() throws Exception {

        abstractFact = new AbstractFactory();
        humanFact = abstractFact.getHumanoidType("Monster");
        a1 = humanFact.getHumanoidType("Drone");
        a2 = humanFact.getHumanoidType("");
        humanFact = abstractFact.getHumanoidType("");
        a3 = humanFact.getHumanoidType("Strong");
        a4 = humanFact.getHumanoidType("");
    }

    @Test
    public void testAbstractFactory() throws Exception {

        assertTrue(a1.getType() == "Drone");
        assertTrue(a2.getType() == "Mum");
        assertTrue(a3.getType() == "Strong");
        assertTrue(a4.getType() == "Weak");
    }
}
