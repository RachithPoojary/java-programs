import java.util.Arrays;
import java.util.Scanner;

class CheckSort {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array:");
         int num = sc.nextInt();
         int[] arr = new int[num];
         for (int i = 0; i< arr.length; i++) {
             arr[i] = sc.nextInt();
         }
         System.out.println(Arrays.toString(arr));
         if (isSortAsc(arr)){
             System.out.println(" Array is sorted in ascending order");
         }else if (isSortDesc(arr)){
             System.out.println("Array is sorted in descending order");
         }else {
             System.out.println("Array is not sorted");
         }
     }
     public static boolean isSortAsc(int[] arr){
         boolean sorted = false;
         for (int i = 1;i< arr.length;i++){
             if (arr[i-1]>arr[i]){
                 return false;
             }
         }
         return true;
     }
    public static boolean isSortDesc(int[] arr){
        boolean sorted = false;
        for (int i = 1;i< arr.length;i++){
            if (arr[i-1]<arr[i]){
                return false;
            }
        }
        return true;
    }
}
