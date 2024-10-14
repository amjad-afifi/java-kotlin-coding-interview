package org.cocharge.Utils;

import java.util.Random;

/**
 * The {@code gameUtils} class is the util class that provides helper methods
 * for the Rock, Paper, Scissors game. It contains 2 methods, getRandomHands, which
 * selects randomly one out of Hand enum class value, and printResults, which given the
 * results of each player, prints the game results.
 */
public class gameUtils {

    public static <T extends Enum<?>> T getRandomHand(Class<T> enumClass) {
        Random random = new Random();
        T[] enumConstants = enumClass.getEnumConstants();
        return enumConstants[random.nextInt(enumConstants.length)];
    }

    public static void printResults(int playerA, int playerB, int draws){
        System.out.printf("Player A wins %s of 100 games\n", playerA);
        System.out.printf("Player B wins %s of 100 games\n", playerB);
        System.out.printf("Draws: %s of 100 games", draws);
    }
}
