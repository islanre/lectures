import java.util.Scanner;

public class Hellofile {
public static void main(String[] arg){
System.out.println("Hello World");
System.out.println("Hellofile.main()");

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