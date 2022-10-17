package programme4;


import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class NameOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println("Enter year:");
        Scanner obj = new Scanner(System.in);
        int y = obj.nextInt();
        NameOfDaysInMonth n = new NameOfDaysInMonth();
        boolean s = n.isLeapYear(y);
        // System.out.println(s);
        System.out.println("Enter month");
        int month = obj.nextInt();
        int a = n.getDaysInMonth(y, month);
        System.out.println(a);
        switch (month){
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }

        obj.close();
    }

    public boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                String s = "Leap Year";
                System.out.println(s + year);
                return true;
            } else {
                String s = "Not Leap Year";
                System.out.println(s + year);
                return false;
            }
        } else {
            String s = "invalid year";
            System.out.println(s + year);
            return false;
        }
    }

    public int getDaysInMonth(int year, int month) {
        if ((month < 1 && year < 1) || (month > 12 && year > 9999)) {
            return -1;
        } else {
            /*     else {*/
            boolean s = isLeapYear(year);
            if (s == false) {

                if (month == 1 || month == 3 || month == 5 || month == 7 ||
                        month == 8 || month == 10 || month == 12) {
                    return 31;
                } else if (month == 2) {
                    return 28;
                }
            } else {
                return 29;
            }
            return 30;
        }

    }

}
