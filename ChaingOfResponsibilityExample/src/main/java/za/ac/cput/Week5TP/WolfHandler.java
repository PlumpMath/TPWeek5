package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class WolfHandler extends MonsterHandler {

    public String handleRequest(MonsterEnum request)
    {
        if (request == MonsterEnum.Wolf)
        {
            return "Wolf";
        }
        else
        {
            monsterHandler.handleRequest(request);
        }

        return "Empty";
    }
}