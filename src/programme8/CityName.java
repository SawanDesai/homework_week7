package programme8;

import java.util.Objects;
import java.util.Scanner;

public class CityName {

    public static void main(String[] args) {

        Scanner city = new Scanner(System.in);
        System.out.println("Write first letter of city from (A to F only)");
        String a = city.nextLine();
        if (Objects.equals(a.toUpperCase(), "A")) {
            System.out.println("City is Ahmedabad");
        } else if (Objects.equals(a.toUpperCase(), "B")) {
            System.out.println("City is Bombay");
        } else if (Objects.equals(a.toUpperCase(), "C")) {
            System.out.println("City is Chinnai");
        } else if (Objects.equals(a.toUpperCase(), "D")) {
            System.out.println("City is Delhi");
        } else if (Objects.equals(a.toUpperCase(), "E")) {
            System.out.println("City is Earnakulam");
        } else if (Objects.equals(a.toUpperCase(), "F")) {
            System.out.println("City is Faridabad");
        } else {
            System.out.println("Error: Invalid Entry");
        }
    }
}
