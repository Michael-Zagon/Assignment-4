/*
* This is the asterisks glass program for assignment 4
*
* @author Michael Zagon
* @version 1.0
* @since 2024-05-15
*
*/

import java.util.Scanner;

/**
 * This is the main class for the asteriskglass
 */
final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if called
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This is the hourglass function.
     *
     * @param asterisk this is for the asterisks.
     * @param spaces this is for the spaces.
     */
    static void asteriskGlass(final int asterisk, final int spaces) {

        // These are the variables
        String hourGlass = "";

        // This is the loop for the blankspace
        for (int counter1 = 0; counter1 < spaces; counter1++) {
            hourGlass += " ";
        }

        // This is where the * are placed
        for (int counter2 = 0; counter2 < asterisk; counter2++) {
            hourGlass += "* ";
        }
        System.out.println(hourGlass);

        // recursive formula
        if (asterisk > 1) {
            asteriskGlass(asterisk - 1, spaces + 1);
        }
        System.out.println(hourGlass);
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Scanner for first input.
        final Scanner firstInput = new Scanner(System.in);

        // Input
        System.out.print("Enter desired size of Asterisks Glass: ");

        try {
            final int amount = firstInput.nextInt();
            System.out.println("");

            // Checks for errors
            if (amount <= 0) {
                System.out.println("Invalid Input, number must be greater than 0");
            } else {
                asteriskGlass(amount, 0);
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("\nInvalid Input");
        }
        System.out.println("\nDone");
    }
}
