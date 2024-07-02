//The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

import java.io.*;
import java.util.*;

public class ReadingLinesTill_EOF {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){
            System.out.println(i+" "+sc.nextLine());
            i++;
        }
        sc.close();
    }
}