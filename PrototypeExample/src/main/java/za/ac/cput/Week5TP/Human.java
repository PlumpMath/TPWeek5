package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/07.
 */
public class Human implements Prototype{

    String name,sex;
    int age;

    public Human(String name, String sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public Prototype doClone() {
        return new Human(name, sex, age);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
