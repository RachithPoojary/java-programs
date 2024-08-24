import java.util.Arrays;
import java.util.Scanner;

class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        swap(arr);

    }
    public static void swap (int[] arr){
        int swap = 0;
        for(int i = 0;i< arr.length/2;i++){
            swap = arr[i];
            arr[i]=arr[arr.length - i - 1];
            arr[arr.length - i - 1] = swap;




        }
    }
}
