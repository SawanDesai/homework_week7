package programme19;

public class AverageValue {
    public static void main(String[] args) {
        int[] num = new int[]{5, 10, 15, 20, 25};
        // calculate sum of all array element
        int sum = 0;
        for (int i = 0; i < num.length; i++)
            sum = sum +num[i];
        // calculate average value
        double average = sum/num.length;
        System.out.println("average value of the array elements is : " + average);

    }
}
