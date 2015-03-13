package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class RunStratagy implements Stratagy{

    @Override
    public boolean checkDistance(int distance) {

        if(distance < 100) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
