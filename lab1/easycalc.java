import java.util.Scanner;
public class easycalc {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double x,y,z;
        System.out.println("enter the first Number");
        x = scr.nextDouble();
        System.out.println("enter the second number");
        y = scr.nextDouble();
        System.out.println("enter the third number");
        z = scr.nextDouble();
        double result = x*y*z;
        System.out.printf("the product of the 3 number is: %.3f\n", result);
        scr.close();



    }
    
}
