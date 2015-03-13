package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/12.
 */
public class FlyweightMummy implements Flyweight{

    String noise;

    public FlyweightMummy()
    {
        noise = "Hummmm" ;
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
