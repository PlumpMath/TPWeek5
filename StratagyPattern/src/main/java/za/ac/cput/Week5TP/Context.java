package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class Context {

    int distance;
    Stratagy stratagy;

    public Context(int distance, Stratagy stratagy)
    {
        this.distance = distance;
        this.stratagy = stratagy;
    }

    public void setStratagy(Stratagy stratagy) {
        this.stratagy = stratagy;
    }

    public int getDistance() {

        return distance;
    }

    public boolean getResult()
    {
        return stratagy.checkDistance(distance);
    }
}
