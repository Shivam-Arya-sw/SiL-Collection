import java.util.Scanner;

public class LuckyNumber{
    static int co=2;
    static boolean isLuckyNumber(int n){
        if (co> n)
            return true;
        if (n%co==0)
            return false;

        n=n-(n/co);
        co++;
        return isLuckyNumber(n);
    }

    public static void main(String ...s){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        if(isLuckyNumber(num))
            System.out.println(num+" is a Lucky Number.");
        else
            System.out.println(num+" is not a Lucky Number.");
        sc.close();
    }
}
