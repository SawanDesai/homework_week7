package programme10;

import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
        System.out.println("input the calculation symbol +,-,*,or /");

        Scanner input = new Scanner(System.in);

        char n = input.next().charAt(0);
        System.out.println("Enter first Number:   ");
        float a = input.nextFloat();
        System.out.println("Enter second Number:   ");
        float b = input.nextFloat();
        input.close();

        if (n == '+') {
            System.out.println(a + "+" + b + " = " + (a+b));
        } else if (n == '-') {
            System.out.println(a + "-" + b + " = " + (a-b));
        }else if (n == '*') {
            System.out.println(a + "*" + b + " = " + (a*b));
        }  else if (n == '/') {
            System.out.println(a + "/" + b + " = " + (a/b));
        }

        }


    }




