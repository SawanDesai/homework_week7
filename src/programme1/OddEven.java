package programme1;

import java.util.Scanner;

public class OddEven {
    public  static void main(String[]args){

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a number");

        int num = number.nextInt();
        number.close();

        String OddEven = (num % 2 == 0)? "even" : "odd";
        System.out.println(num + " is " + OddEven);
    }

}
