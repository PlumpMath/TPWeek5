package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/12.
 */
public class SlowMonster extends Monster {

    public SlowMonster()
    {
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}
