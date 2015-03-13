package za.ac.cput.Week5TP.MonsterFactory;

import za.ac.cput.Week5TP.AbstractFactory.AbstractFactory;
import za.ac.cput.Week5TP.HumanoidFactory.Humanoid;
import za.ac.cput.Week5TP.HumanoidFactory.HumanoidFactory;

/**
 * Created by student on 2015/03/07.
 */
public class MonsterFactory extends HumanoidFactory {


    public Humanoid getHumanoidType(String type)
    {
        if("Drone".equals(type))
        {
            return new Zombie();
        }
        else
        {
            return new Mummy();
        }
    }

}
