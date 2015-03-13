package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public interface PictureSubject {

    public void addObserver(PictureObserver pictureObserver);

    public void removeObserver(PictureObserver pictureObserver);

    public void doNotify();
}
