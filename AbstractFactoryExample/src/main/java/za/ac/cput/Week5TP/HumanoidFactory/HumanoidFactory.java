package za.ac.cput.Week5TP.HumanoidFactory;

import za.ac.cput.Week5TP.AbstractFactory.AbstractFactory;
import za.ac.cput.Week5TP.HumanFactory.HumanFactory;
import za.ac.cput.Week5TP.MonsterFactory.MonsterFactory;

/**
 * Created by student on 2015/03/07.
 */
public abstract class HumanoidFactory{

    public abstract Humanoid getHumanoidType(String type);

}
