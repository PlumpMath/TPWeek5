package za.ac.cput.Week5TP;

import java.util.Random;

/**
 * Created by student on 2015/03/07.
 */
public class SingletonExample {

    private static SingletonExample example = null;

    private SingletonExample(){
    }

    public static SingletonExample getInstance(){
        if(example == null){
            example = new SingletonExample();
        }
        return example;
    }

    public int randomNum(int i){

        Random randomGenerator = new Random();
        int p = randomGenerator.nextInt(i);
        randomGenerator = null;

        return p;
    }
}
