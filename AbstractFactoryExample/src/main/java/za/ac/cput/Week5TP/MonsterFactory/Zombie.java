package za.ac.cput.Week5TP.MonsterFactory;

import za.ac.cput.Week5TP.HumanoidFactory.Humanoid;

/**
 * Created by student on 2015/03/07.
 */
public class Zombie extends Humanoid {

    @Override
    public String getType()
    {
        return "Drone";
    }

}
