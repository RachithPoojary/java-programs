import java.util.Arrays;
import java.util.Scanner;

class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int Max = max(arr);
        System.out.println("Maximum value in the array is = "+ Max);
        int Min = min(arr);
        System.out.println("Minimum value in the array is = "+ Min);

    }
    public static int max(int[] arr){
        int Max = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>Max)
                Max = arr[i];
        }
        return Max;
    }
    public static int min(int[] arr){
        int Min = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (arr[i]<Min)
                Min = arr[i];
        }
        return Min;
    }
}
