package programme11;

import java.util.Scanner;

public class DividedBy3or5 {
    public static void main (String args[]){
        char ch;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2=scan.nextInt();
        System.out.print("Enter the operator you want(+, -, *, /) :");
        ch=scan.next().charAt(0);
        if(ch=='+'){
            System.out.println("\nAddition of "+num1+"+"+num2+" = "+(num1+num2 ));
        }
        else if(ch=='-'){
            System.out.println("Substraction of "+num1+"-"+num2+" = "+(num1-num2 ));
        }
        else if(ch=='*'){
            System.out.println("Multiplication of "+num1+"x"+num2+" = "+(num1*num2 ));
        }
        else if(ch=='/'){
            System.out.print("Division of "+num1+"/"+num2+" = "+(num1/num2 ));
        }
        else{
            System.out.print("Operator is not available" );
        }
    }

}
