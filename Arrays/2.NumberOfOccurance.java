import java.util.Arrays;
import java.util.Scanner;

class NumberOfOccurance {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();

         int[] arr = new int[num];
         for (int i = 0;i< arr.length;i++){
             arr[i]=sc.nextInt();
         }
         System.out.println(Arrays.toString(arr));
         System.out.println("Enter the number to be searched");
         int number = sc.nextInt();
         int count=occurance(arr,number);
         System.out.println("Ocuurence of "+number+ " in the given array is = "+ count + " times");

     }
     public static int occurance(int[] arr,int number){
         int count = 0;

         for ( int i =0; i< arr.length;i++){
             if (arr[i]==number){
                 count++;
             }
         }
         return count;
     }
}
