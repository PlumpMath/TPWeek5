package za.ac.cput.Week5TP;

import java.util.Date;

/**
 * Created by student on 2015/03/12.
 */
public class Proxy {

    SlowMonster slowMonster;

    public Proxy()
    {
        System.out.println("Creating proxy at " + new Date());
    }

    public void groan()
    {
        if (slowMonster == null)
        {
            slowMonster = new SlowMonster();
        }
        slowMonster.groan();
    }

}
