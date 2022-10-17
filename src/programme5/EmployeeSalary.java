package programme5;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        String Name,Basic;
        int EmployeeID;
        double salary,GrossSalary, S,HRA,DA,TA,PF;

        Scanner pay = new Scanner(System.in);
        System.out.println("Please enter your name");
        Name = pay.nextLine();
        System.out.println("Please enter your ID");
        EmployeeID = pay.nextInt();
        System.out.println("Please enter your Salary");
        salary = pay.nextDouble();

        HRA = (25000*10)/100;
        TA  = (25000*8)/100;
        DA  =(25000*9)/100;
        PF = (25000*20)/100;
        GrossSalary = salary +HRA +TA+DA-PF;

        System.out.println("_____________________________________");
        System.out.println("|           Salary Slip             |");
        System.out.println("|___________________________________|");
        System.out.println("| Employee ID   : "+EmployeeID+"    |");
        System.out.println("| Employee Name : "+Name+"          |");
        System.out.println("|___________________________________|");
        System.out.println("| Basic Salary  : "+salary+"        |");
        System.out.println("| HRA 10%       :  "+HRA+"          |");
        System.out.println("| TA 8%         :  "+TA+"           |");
        System.out.println("| DA 9%         :  "+DA+"           |");
        System.out.println("| PF - 20%      :  "+PF+"           |");
        System.out.println("|___________________________________|");
        System.out.println("|Gross Salary   :  "+GrossSalary+"  |");
        System.out.println("|===================================|");



    }
}
