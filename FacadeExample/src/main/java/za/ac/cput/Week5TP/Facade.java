package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/12.
 */
public class Facade {

    public int rollOneDie()
    {
        RollDice roller = new RollDice();
        return roller.rollDie();
    }

    public int rollTwoDie()
    {
        RollAgain roller2 = new RollAgain();
        return roller2.rollAgain();
    }

    public int rollFourDie()
    {
        RollAgainAndAgain roller3 = new RollAgainAndAgain();
        return roller3.rollAgainAndAgainAndAgain();
    }

}
