/*
 * Name: Nazir Knuckles
 * Date: June 28, 2026
 * Assignment: Module 3 - Nested For Loops
 *
 * Purpose:
 * This program uses nested for loops to display a pyramid of powers of
 * two with an @ symbol at the end of each line.
 */

public class KnucklesPyramid {

    public static void main(String[] args) {

        // Loop through each row of the pyramid
        for (int row = 0; row < 7; row++) {

            // Print leading spaces for formatting
            for (int spaces = 0; spaces < (6 - row); spaces++) {
                System.out.print("  ");
            }

            // Print ascending powers of 2
            for (int i = 0; i <= row; i++) {
                System.out.print((int) Math.pow(2, i) + " ");
            }

            // Print descending powers of 2
            for (int i = row - 1; i >= 0; i--) {
                System.out.print((int) Math.pow(2, i) + " ");
            }

            // Print the required @ symbol
            System.out.println("@");
        }
    }
}