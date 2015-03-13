package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/12.
 */
public class FlyweightZombie implements Flyweight {

    String noise;

    public FlyweightZombie()
    {
        noise = "groan" ;
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

    }


    @Override
    public String getNoise() {
        return noise;
    }
}
