package za.ac.cput.Week5TP;

import java.util.Random;

/**
 * Created by student on 2015/03/12.
 */
public class RollAgainAndAgain {

    public int rollAgainAndAgainAndAgain()
    {
        RollDice roller = new RollDice();
        RollAgain roller2 = new RollAgain();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(6);
        randomGenerator = null;

        return 1 + randomInt + roller2.rollAgain() + roller.rollDie();
    }
}
