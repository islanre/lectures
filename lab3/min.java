package lab3;

import java.util.Random;

import javafx.beans.property.adapter.ReadOnlyJavaBeanIntegerPropertyBuilder;

public class min {
    /*public static void main(String[] args) {
         double min = 10.0;
        double max = 15.0;
        double range = max - min;
        Random rand = new Random();
        double randv = rand.nextDouble(range) + min;
        System.out.println("Range = " +range + " Value= " +randv); */


        /*Creating own meathod */
        public static double getrandom(double min, double max) {
       double range = max - min;
        Random rand = new Random();
        double randv = rand.nextDouble(range) + min;
        return randv;
    }
    public static void main(String[] args) {
        int randnum = 5;
        for (int i = 0; i < randnum; i++){
            double randv = getrandom (10,15);
            System.out.println("Value "+ i + randv);
        }
    }
}
