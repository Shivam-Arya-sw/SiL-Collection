import java.util.*;
public class Anagram
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first word: ");
		String s1=sc.next().toLowerCase();
		sc.nextLine();
		System.out.println("Enter the second word: ");
		String s2=sc.next().toLowerCase();
		boolean b=false;
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		if(s1.length()!=s1.length()){
		    System.out.println("NOT ANAGRAM");
		}
		else
		{
		    for(int i=0;i<ch1.length;i++){
		        for(int j=0;j<ch1.length-i-1;j++){
		            if(ch1[i]>ch1[i+1]){
		                char c=ch1[i];
		                ch1[i]=ch1[i+1];
		                ch1[i+1]=c;
		            }
		            if(ch2[i]>ch2[i+1]){
		                char cc=ch2[i];
		                ch2[i]=ch2[i+1];
		                ch2[i+1]=cc;
		            }
		        }
		    }
		    
		    for(int i=0;i<ch1.length;i++){
	            if(!(ch1[i]==ch2[i])){
	                b=true;
	                break;
	            }
		    }
		    
		    if(b){
		        System.out.println("NOT ANAGRAM");
		    }
		    else{
		        System.out.println("ANAGRAM");
		    }
		}
	}
}
