package za.ac.cput.Week5TP;

import java.util.Random;

/**
 * Created by student on 2015/03/12.
 */
public class RollDice {

    public int rollDie()
    {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(6);
        randomGenerator = null;
        return 1 + randomInt;
    }
}
