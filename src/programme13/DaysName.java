package programme13;

import java.util.Scanner;

public class DaysName {
    public static void main(String[] args) {
        int Day;
        System.out.println("Enter a number between 1 and 7 :");

        Scanner n = new Scanner(System.in);
        Day = n.nextInt();

        switch (Day){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days only. Please enter valid number.");


        }

    }

}
