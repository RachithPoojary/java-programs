import java.util.Arrays;
import java.util.Scanner;

class SwapElement {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array:");
         int num = sc.nextInt();
         int[] arr = new int[num];
         for (int i = 0; i< arr.length; i++) {
             arr[i] = sc.nextInt();
         }
         System.out.println(Arrays.toString(arr));
         System.out.println("Enter the element to be replaced :");
         int rel = sc.nextInt();
         System.out.println("Enter the element to be added  :");
         int add = sc.nextInt();



         for (int i = 0; i< arr.length;i++){
             if (arr[i]== rel)
                 arr[i]=add;
         }
         System.out.println(Arrays.toString(arr));

     }
}
