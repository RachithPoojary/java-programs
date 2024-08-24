import java.util.Arrays;
import java.util.Scanner;

class DeleteFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion\n");
        System.out.println("Enter the size of the array:");
        int num = sc.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i< numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numArr));
        System.out.print("Now, enter then number you want to delete: ");
        int numToDelete = sc.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array");
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = NumberOfOccurance.occurance(numArr, numToDelete);
        if (occ == 0) {
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
}





