package programme9;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner letter = new Scanner(System.in);

        System.out.println("Please write first letter of City(A to F only");

        String a = letter.nextLine();

        switch (a.toUpperCase()){
            case "A":
                System.out.println("City is Ahmedabad");
                break;
            case "B":
                System.out.println("City is Bombay");
                break;
            case "C":
                System.out.println("City is Chinnai");
                break;
            case "D":
                System.out.println("City is Delhi");
                break;
            case "E":
                System.out.println("city is Earnakulam");
                break;
            case"F":
                System.out.println("City is Faridabad");
            default:
                System.out.println("Error: Invalid entry");

        }
    }

}
