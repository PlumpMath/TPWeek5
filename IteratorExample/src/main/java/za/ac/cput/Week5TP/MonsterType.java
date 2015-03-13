package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class MonsterType {

    String name;
    String type;

    public MonsterType(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    public String toString()
    {
        return name + " " + type;
    }
}
