package za.ac.cput.Week5TP.HumanFactory;

import za.ac.cput.Week5TP.AbstractFactory.AbstractFactory;
import za.ac.cput.Week5TP.HumanoidFactory.Humanoid;
import za.ac.cput.Week5TP.HumanoidFactory.HumanoidFactory;

/**
 * Created by student on 2015/03/07.
 */
public class HumanFactory extends HumanoidFactory {



    public Humanoid getHumanoidType(String name)
    {
        if(name == "Strong")
        {
            return new StrongHuman();
        }
        else
        {
            return new WeakHuman();
        }
    }


}
