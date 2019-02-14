package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int guessNumber = (int) (Math.random() * 100) +1;
        boolean userGuessSuccess=false;

        System.out.println("I have randomly chosen a number between [1-100]");
        System.out.println("Try to guess it.");
        Scanner scanner = new Scanner(System.in);

        for(int i= 10;i>0;i--) {
            System.out.println("You have " + i + " guess (es) left:");
            int guessUserNumber = scanner.nextInt();

            if (guessUserNumber < 0 || guessUserNumber > 100) {
                System.out.println("Invalid Number , you Should Choose a number between 1 and 100!");
            } else if (guessUserNumber > guessNumber) {
                System.out.println("It is smaller than " + guessUserNumber);
            } else if (guessUserNumber < guessNumber) {
                System.out.println("It is greater than " + guessUserNumber);
            } else {
                System.out.println("CORRECT ... YOU WIN");
                userGuessSuccess=true;
                break;
            }
        }
        if (!userGuessSuccess)
        {
            System.out.println("Sorry ..You run out of guesses");
            System.out.println("The number was: " + guessNumber);
        }


    }

}
