package lab2;

import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
       
System.out.println("enter the value for i");
Scanner value = new Scanner(System.in);
int a = value.nextInt(); 
    for (int i= 0; i < a; i= i+ 1)
    {
        System.out.println("The value of i is :" + i );
    }
    value.close();
}
}
