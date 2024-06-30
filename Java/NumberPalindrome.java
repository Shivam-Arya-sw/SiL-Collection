import java.util.Scanner;

public class NumberPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        sc.close();
    }
    
    public static boolean isPalindrome(int num) {
        if (num < 0)
            return false;
        int or = num;
        int rev = 0;
        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }
        return or == rev;
    }
}
