package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class SmallMonster extends  Monster{
    @Override
    public String getName() {
        return "small Monster";
    }

    @Override
    public String getType() {
        return "weak";
    }

    @Override
    public String getNoise() {
        return "yelp";
    }
}
