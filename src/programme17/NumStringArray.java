package programme17;

import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class NumStringArray {
    public static void main(String[] args) {
        int[] array1 = {21,1109,101,45,147,75,999,658,179};
        String[] array2 = {"Tom","Micky","Ricky","Albert","kate","Friday","April"};

        System.out.println("Original number array :" + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array :" + Arrays.toString(array1));

        System.out.println("Original string array :" + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array :" + Arrays.toString(array2));

    }
}
