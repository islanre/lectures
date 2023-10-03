import java.util.Scanner;

public class IO_Demo {
    public static void main(String[] args){
        Scanner stn = new Scanner(System.in);
        System.out.println("Enter yur name");
        String name = stn.next();
        System.out.println("Enter your age");
        int age = stn.nextInt();
        System.out.println("Your name is " + name
                + " You age is " + age);
        stn.close();
    }
}