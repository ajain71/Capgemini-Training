
import java.util.Scanner;
public class CalendarDisplay {
    private static final String[] MONTHS = {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };
    private static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    private static int getDaysInMonth(int month, int year) {
        if (month == 1 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_IN_MONTH[month];
    }
    private static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }
    private static void printCalendar(int month, int year) {
        System.out.println("\n  " + MONTHS[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0 || day == daysInMonth) {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt() - 1;
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.close();
        if (month < 0 || month > 11) {
            System.out.println("Invalid month! Please enter a value between 1 and 12.");
            return;
        }
        printCalendar(month, year);
    }
}

