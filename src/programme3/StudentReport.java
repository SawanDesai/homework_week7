package programme3;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class StudentReport {
    public static void main(String[] args) {
        String name, Result, Grade;
        int RollNo, Maths, Science, English, Total, Percentage, Marks;

        Scanner report = new Scanner(System.in);

        System.out.println("Please enter your name:");
        name = report.nextLine();

        System.out.println("Please enter your RollNo");
        RollNo = report.nextInt();

        System.out.println("Please enter your Marks for Maths");
        Maths = report.nextInt();
        System.out.println("Please enter your Marks for Science");
        Science = report.nextInt();
        System.out.println("Please enter your Marks for English");
        English = report.nextInt();

        Total = Maths + Science + English;

        if (Maths >= 0 && Maths <= 100 && Science >= 0 && Science <= 100 && English >= 0 && English <= 100) {

            Percentage = Total / 3;

            if (Maths >= 35 && Science >= 35 && English >= 35) {
                Result = "Pass";
            } else {
                Result = "Fail";
            }

            Grade = report.nextLine();
            if (Percentage >= 80) {
                Grade = "A+";
            } else if (Percentage >= 60) {
                Grade = "A";
            } else if (Percentage >= 50) {
                Grade = "B";
            } else if (Percentage >= 35) {
                Grade = "C";
            }
            System.out.println("_____________________________");
            System.out.println("|                           |");
            System.out.println("|       MARK SHEET          |");
            System.out.println("|---------------------------|");
            System.out.println("|  Name    :" + name + "        |");
            System.out.println("|  Roll No :" + RollNo + "      |");
            System.out.println("|---------------------------|");
            System.out.println("|  Subject  : Marks         |");
            System.out.println("|---------------------------|");
            System.out.println("|  Maths    : " + Maths + "     |");
            System.out.println("|  Science  :" + Science + "    |");
            System.out.println("|  English  :" + English + "    |");
            System.out.println("|---------------------------|");
            System.out.println("|  Total    : " + Total + "     |");
            System.out.println("|---------------------------|");
            System.out.println("|  Percentage:"+Percentage + "|");
            System.out.println("|   Result   :   " + Result + " |");
            System.out.println("|   Grade     : " + Grade + "   |");
            System.out.println("|___________________________|");

        } else {
            System.out.println("Invalid inputs, Marks should be between o to 100");
        }
        report.close();
    }
}