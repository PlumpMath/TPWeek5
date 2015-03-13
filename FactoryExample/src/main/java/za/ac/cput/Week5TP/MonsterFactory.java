package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/07.
 */
public class MonsterFactory {

    private static MonsterFactory factory = null;

    private MonsterFactory(){
    }

    public static MonsterFactory getInstance(){

        if(factory == null)
        {
            factory = new MonsterFactory();
        }
        return factory;
    }

    public Monster getMonster(String type)
    {
        if("Drone".equals(type))
        {
            return new Zombie();
        }
        else
        {
            return new Mummy();
        }
    }

}
