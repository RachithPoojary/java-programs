import java.util.Arrays;
import java.util.Scanner;

class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i = 0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int Sum = sum(arr);
        System.out.println(" Sum of the array = " +  Sum);
        int Avg = average(arr);
        System.out.println(" Average of the array = " + Avg);
    }
    public static int sum(int[] arr){
         int Sum =0;

        for (int i = 0; i< arr.length;i++){

            Sum += arr[i];
        }
        return Sum;
    }
    public static int average(int[] arr){
        int avg = sum(arr)/ arr.length;
        return avg;
    }
}
