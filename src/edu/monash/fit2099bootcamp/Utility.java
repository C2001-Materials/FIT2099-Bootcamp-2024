package edu.monash.fit2099bootcamp;

import java.util.Random;

/**
 * A class that represents the functionality of generating random integers.
 */
public class Utility {

    /**
     * Generates a random integer between the lower and upper bounds (inclusive).
     *
     * @param lower the lower bound of the random integer
     * @param upper the upper bound of the random integer
     * @return a random integer between the lower and upper bounds (inclusive) in string format
     */
    public static String generateRandomInt(int lower, int upper) {
        Random random = new Random();
        int  randomID = random.nextInt(upper - lower + 1) + lower;
        // return in string format
        return (String.valueOf(randomID));
    }
}
