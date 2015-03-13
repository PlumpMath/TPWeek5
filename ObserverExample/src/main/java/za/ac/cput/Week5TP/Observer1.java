package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class Observer1 implements PictureObserver {

    @Override
    public void doUpdate(String colour) {
        System.out.println("obs1 " +colour) ;
    }
}
