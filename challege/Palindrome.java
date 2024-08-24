import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int rev=reverse(num);
//        System.out.println(rev);
        if (isPalindrome(num))
            System.out.println(num + " is a palindrome");
        else
            System.out.println(num + " is not a palindrome");
    }
    static int reverse(int num){
        int rev=0;
       while(num>0){
           int i = num%10;
            rev= (rev*10 )+ i;
            num /=10;
        }
        return rev;

    }
    static boolean isPalindrome(int num){
        if(reverse(num) == num)
           return true;
        else
            return false;
    }
}
