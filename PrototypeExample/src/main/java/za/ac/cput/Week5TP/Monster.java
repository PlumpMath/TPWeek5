package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/07.
 */
public class Monster implements Prototype{

    private String type;
    private int speed,strength;

    public Monster(String type, int speed, int strength) {
        this.type = type;
        this.speed = speed;
        this.strength = strength;
    }

    @Override
    public Prototype doClone() {
        return new Monster(type,speed,strength);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "type='" + type + '\'' +
                ", speed=" + speed +
                ", strength=" + strength +
                '}';
    }
}
