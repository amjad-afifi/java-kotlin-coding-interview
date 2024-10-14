package org.cocharge;
import java.util.Random;

public class Main {
    private enum Hand {
        ROCK,
        PAPER,
        SCISSORS
    }
    static int playerA = 0;
    static int playerB = 0;
    static int draw = 0;

    private static <T extends Enum<?>> T getRandomHand(Class<T> enumClass) {
        Random random = new Random();
        T[] enumConstants = enumClass.getEnumConstants();
        return enumConstants[random.nextInt(enumConstants.length)];
    }

    private static void printResults(int playerA, int playerB, int draws){
        System.out.printf("Player A wins %s of 100 games \n", playerA);
        System.out.printf("Player B wins %s of 100 games \n", playerB);
        System.out.printf("Draws: %s of 100 games", draws);
    }

    private static void startGame(){
        for(int i = 0; i<100; i++) {
            Hand hand = getRandomHand(Hand.class);

            if(hand.equals(Hand.ROCK)){
                draw++;
            }else if (hand.equals(Hand.PAPER)){
                playerA++;
            }else{
                playerB++;
            }
        }
        printResults(playerA, playerB, draw);
    }

    public static void main(String[] args) {
        startGame();
    }

}