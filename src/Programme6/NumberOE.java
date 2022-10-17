package Programme6;

import java.util.Scanner;

public class NumberOE {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = read.nextInt();
        read.close();

        if(num % 2 == 0){
            System.out.println("This is an even number");
        }else
            System.out.println("This an odd number");

    }

}
