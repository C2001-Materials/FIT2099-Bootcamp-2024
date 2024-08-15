package edu.monash.fit2099bootcamp;

import java.util.Random;

public class Utility {

    public static String generateRandomInt(int lower, int upper) {
        Random random = new Random();
        int  randomID = random.nextInt(upper - lower + 1) + lower;
        // return in string format
        return (String.valueOf(randomID));
    }
}
