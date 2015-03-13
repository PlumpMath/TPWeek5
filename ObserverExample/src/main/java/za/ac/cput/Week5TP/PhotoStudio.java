package za.ac.cput.Week5TP;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by student on 2015/03/13.
 */
public class PhotoStudio implements PictureSubject{

    Set<PictureObserver> pictureObserversSet;
    String colour;

    public PhotoStudio(String colour)
    {
        pictureObserversSet = new HashSet<PictureObserver>();
        this.colour = colour;
    }


    @Override
    public void addObserver(PictureObserver pictureObserver) {
        pictureObserversSet.add(pictureObserver);

    }

    @Override
    public void removeObserver(PictureObserver pictureObserver) {
        pictureObserversSet.remove(pictureObserver);

    }

    @Override
    public void doNotify() {
        Iterator<PictureObserver> it = pictureObserversSet.iterator();
        while (it.hasNext()) {
            PictureObserver pictureObserver = it.next();
            pictureObserver.doUpdate(colour);
        }
    }


    public void setNewColour(String newColour)
    {

        colour = newColour;
        doNotify();
    }
}
