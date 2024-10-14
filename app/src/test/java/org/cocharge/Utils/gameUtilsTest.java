package org.cocharge.Utils;

import org.cocharge.Hand;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.EnumSet;
import static org.junit.jupiter.api.Assertions.*;

class gameUtilsTest {

    @org.junit.jupiter.api.Test
    void getRandomHand() {
       Hand hand = gameUtils.getRandomHand(Hand.class);
       assertTrue(EnumSet.allOf(Hand.class).contains(hand), "getRandomHand should return one of " +
               "Rock, Paper or Scissors");
    }

    @org.junit.jupiter.api.Test
    void printResults() {
        // Step 1: Create a ByteArrayOutputStream to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try {
            // Step 2: Redirect System.out to the outputStream
            System.setOut(new PrintStream(outputStream));

            // Step 3: Create an instance of Printer and call the printMessage method
            gameUtils.printResults(30,40,30);

            // Step 4: Convert the outputStream content to a String and trim it to remove the newline
            String output = outputStream.toString().trim();

            // Step 5: Assert that the output matches the expected value
            assertEquals("Player A wins 30 of 100 games\n" +
                    "Player B wins 40 of 100 games\n" +
                    "Draws: 30 of 100 games", output);
        } finally {
            // Step 6: Restore System.out to its original state
            System.setOut(originalOut);
        }
    }
}
