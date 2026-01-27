// TestForStudents14jan26.java
// dH 1/14/26

import java.util.Scanner;

public class MaddnessWithMethods {
    public static void main(String[] args) {

        System.out.println("\nWelcome to My java test program\n");

        //  Create a Scanner object named scanner
        // this will be used to get an int from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for an integer
        // use 'sout' shortcut
        System.out.println("\n Please enter a whole number: ");
        int userNum = 0;
        userNum = scanner.nextInt();


        System.out.println("\n You entered " + userNum + " thank you!");

 
    }
}