package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/13.
 */
public class Mummyhandler extends MonsterHandler {

    public String handleRequest(MonsterEnum request)
    {
        if (request == MonsterEnum.Mummy)
        {
            return "Mummy";
        }
        else if(monsterHandler != null)
        {
            monsterHandler.handleRequest(request);
        }

        return "Empty";
    }
}