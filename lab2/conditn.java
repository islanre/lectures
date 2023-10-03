package lab2;

import java.util.Scanner;

public class conditn {
    public static void main(String[] args) {
       System.out.println("Enter a number of your choice");
       Scanner inp = new Scanner(System.in);
       int value = inp.nextInt();
       if (value >50 && value <90){
        System.out.println("the value is greater the 50 and less than 90");}
        else if (value > 90){
            System.out.println("the value is grater than 90");}
        else if (value<50){
            System.out.println("the value you entered is less than 50");}
        else{
            System.out.println("the value is close to 100");}
            inp.close();
        }
        
    }

