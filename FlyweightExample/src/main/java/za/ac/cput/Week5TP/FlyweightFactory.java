package za.ac.cput.Week5TP;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Created by student on 2015/03/12.
 */
public class FlyweightFactory {

    private static FlyweightFactory fact;


    private Map<String, Flyweight> flyweightPool;


    private FlyweightFactory()
    {
        flyweightPool = new HashMap<String, Flyweight>();
    }


    public static FlyweightFactory getInstance()
    {
        if(fact == null)
        {
            fact = new FlyweightFactory();
        }
        return fact;
    }

    public Flyweight getFlyweight(String key)
    {
        if(flyweightPool.containsKey(key))
        {
            return flyweightPool.get(key);
        }
        else
        {
            Flyweight flyweight;
            if("groan".equals(key))
            {
                flyweight = new FlyweightZombie();
            }
            else
            {
                flyweight = new FlyweightMummy();
            }
            flyweightPool.put(key,flyweight);

            return flyweight;
        }
    }

}
