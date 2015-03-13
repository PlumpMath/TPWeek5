package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/11.
 */
public class Minion implements Component {

    String name,sound;

    public Minion(String name, String sound)
    {
        this.name = name;
        this.sound = sound;
    }


    @Override
    public void sayName() {

        System.out.println("My name is: " + name);

    }

    @Override
    public void growl() {

        System.out.println(sound);
    }
}
