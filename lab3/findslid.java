package lab3;

public class findslid {
    public static void main(String[] args) {
        double angle = 95.3;
        double side1 = 6.2;
        double side2 = 7.5;
        
        double radians = angle * Math.PI/180;
        double side3 = (side1*side2) + (side2*side2) - (2*side1*side2*Math.cos(radians));
        side3 = Math.sqrt(side3);
        System.out.printf("side1 = %.1f side 2 = %.1f Angle= %.1f side 3 = &.1f /n", side1, side2, side3);
    }
    
}
