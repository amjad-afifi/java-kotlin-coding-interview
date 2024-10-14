package org.cocharge;


import org.cocharge.Utils.gameUtils;
import static org.cocharge.Utils.gameUtils.getRandomHand;
import static org.cocharge.Utils.gameUtils.printResults;

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