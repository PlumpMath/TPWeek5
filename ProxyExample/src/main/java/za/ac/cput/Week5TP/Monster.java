package za.ac.cput.Week5TP;

import java.util.Date;

/**
 * Created by student on 2015/03/12.
 */
public abstract class Monster {

    public void groan()
    {
        System.out.println(this.getClass().getSimpleName() + " growls at " + new Date());
    }
}
