package org.cocharge.Utils;

import java.util.Random;

public class gameUtils {

    public enum Hand {
        ROCK,
        PAPER,
        SCISSORS
    }

    public static <T extends Enum<?>> T getRandomHand(Class<T> enumClass) {
        Random random = new Random();
        T[] enumConstants = enumClass.getEnumConstants();
        return enumConstants[random.nextInt(enumConstants.length)];
    }

    public static void printResults(int playerA, int playerB, int draws){
        System.out.printf("Player A wins %s of 100 games \n", playerA);
        System.out.printf("Player B wins %s of 100 games \n", playerB);
        System.out.printf("Draws: %s of 100 games", draws);
    }
}
