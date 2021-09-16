import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a year.");
        Scanner scr = new Scanner(System.in);
        long year = scr.nextLong();
        System.out.println( "Is a leap year: " + (isLeapYear(year)));
        System.out.println("Could you confirm your year (type again) ?");
        int yearTwo = scr.nextInt();
        System.out.println("And what month (number) ?");
        int month = scr.nextInt();
        System.out.println(getDaysInMonth(month, yearTwo));

    }

    public static boolean isLeapYear(long year) {
        if ((year < 1) || (year > 9999)) {
            System.err.println("Invalid year.");
            return false;
        } else {
            long isLeapYear = year % 4;
            long testIsLeapYear = year % 100;
            long testIsLeapYearTwo = year % 400;
            return (isLeapYear == 0) && (testIsLeapYear == 0) || (testIsLeapYearTwo == 0);
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        }
        if (isLeapYear(year) && month == 2) {
            return 29;

        } else {
            switch (month) {
                case 4:
                case 6:
                case 7:
                case 9:
                case 11:
                    return 30;
                case 2:
                    return 28;
                default:
                    return 31;
            }
        }
    }
}
