package lab2;

import java.util.Scanner;

public class switchcase {
    public static String mynewcases(String monthsString, int months) {
       
           switch (months) {
            case 1:
                monthsString = "January";
                break;
            case 2:
                monthsString = "February";
                break;
            case 3:
                monthsString = "March";
                break;
            case 4:
                monthsString = "April";
                break;
            case 5:
                monthsString = "May";
                break;
            case 6:
                monthsString = "June";
                break;
            case 7:
                monthsString = "July";
                break;
            case 8:
                monthsString = "August";
                break;
            case 9:
                monthsString = "September";
                break;
            case 10:
                monthsString = "October";
                break;
            case 11:
                monthsString = "November";
                break;
            case 12:
                monthsString = "December";
                break;
            default:
                monthsString = "Invalid months";
                break;
        }
        return monthsString;
    }

    public static void main() {
        System.out.println("Pick a number from 1 - 12");
        Scanner inp = new Scanner(System.in);
        int months = inp.nextInt();
        String monthsString = ""; // Initialize monthsString with an empty string
        monthsString = mynewcases(months, monthsString);
        System.out.println("The value corresponds to the month: " + monthsString);
        inp.close();
    }
}

