/*You are given an integer , you have to convert it into a string.
Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
 can range between  to  inclusive.*/

import java.util.Scanner;

public class Int_to_String {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    try{
        String s = Integer.toString(n);
        System.out.println("Good job");
    }
    catch(Exception e){
        System.out.println("Wrong answer");      }
}
}