package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class FrenchBuyer extends Buyer {

    public FrenchBuyer(Mediator mediator) {
        super(mediator, "euro");
        this.mediator.registerFrenchBuyer(this);
    }
}