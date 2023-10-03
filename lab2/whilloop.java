package lab2;

import java.util.Scanner;

public class whilloop {
    public static void main(String[] args) {
        int correct_guess = (int)(Math.random() * 6) + 1;
 int guess;
 boolean continueGuessing = true;
 Scanner input = new Scanner(System.in);
 while (continueGuessing) {
 System.out.println("Guess a number");
 guess = input.nextInt();
 if (guess == correct_guess) {
 System.out.println("Congratulations! You won!");
 continueGuessing = false;
 } else {
 System.out.println("Try again");
 }
 
    }}
public static void branch(String[] args) {
    int correct_guess = (int)(Math.random() * 6) + 1;
    int guesscount = 1;
    int guesslimit = 5;
 int guess;
 boolean continueGuessing = true;
 Scanner input = new Scanner(System.in);
 while (continueGuessing) {
 System.out.println("Guess a number");
 guess = input.nextInt();
 if (guesscount > guesslimit){
    System.out.println("You have exceeded the maximun trial");
 }
 else {
    System.out.println("Guess another number");
 }
 if (guess == correct_guess) {
 System.out.println("Congratulations! You won!");
 continueGuessing = false;
 } else {
 System.out.println("Try again");
 }
}

}}

