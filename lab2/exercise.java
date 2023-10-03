package lab2;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        int a, b;
        System.out.println("enter the first number A: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("enter the second number B: ");
        b = input.nextInt();
        if (a == b-2){
            System.out.println("the value for A is less than the value for B by 2");
        }
        else if (a == b -5) {
            System.out.println("the value of A is greater then B by 5");
        }
else if (a==b){
    System.out.println("the value of A is same as the value of B");
}
else if(a==b +1){
    System.out.println("the value of A is equeal to B plus 1");
}
else if (a == b +2) {
    System.out.println("the value of A is equal to the value of B + 2");
}
else {
    System.out.println("All the conditions are not met for both A and B");
}
input.close();
    }
    
}
