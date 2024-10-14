package org.cocharge;

import static org.cocharge.Utils.gameUtils.getRandomHand;
import static org.cocharge.Utils.gameUtils.printResults;

/**
 * The {@code Main} class is the main starting point of the game.
 * It contains the logic of Rock, Paper, Scissors game.
 * It runs 100 times against a rock-bot opponent and each time picks randomly
 * one out of Rock, Paper, Scissors.
 * If player 1 draws Rock, it's a draw.
 * If player 1 draws Paper, it's a win.
 * If player 1 draws Scissors, it's a loss.
 */

public class Main {
     static int playerA = 0;
     static int playerB = 0;
     static int draw = 0;

    private static void startGame(){
        for(int i = 0; i<100; i++) {
            Hand player1Hand = getRandomHand(Hand.class);

            if(player1Hand.equals(Hand.ROCK)){
                draw++;
            }else if (player1Hand.equals(Hand.PAPER)){
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