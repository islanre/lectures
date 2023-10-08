package lab3;

import java.util.Random;

public class exercise3 {
    public static double random_radius(double max, double min) {
        double range = max-min;
        double radius = min + (Math.random()*range);
        return radius;
    }
    public static double areavalue(double radius) {
        double area = 2 * Math.PI* radius;
        return area;
    }
    public static void main(String[] args) {
    
        double radius = random_radius(10, 5);
        System.out.println("radius is: "+ radius + "area is: " + areavalue(radius));
    }
}
