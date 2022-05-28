/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	//check whether the number is palindrome or not
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //121
		int rem,rev=0,i;
		
		int temp= n;  //121
		
		while(n != 0)  
		{
		    
		    rem = n%10;  //1
		    rev = rev * 10 + rem;  //  121
		    n = n/10; //0
		    
		    
		}
		if(temp==rev)
		System.out.println("Palindrome");
		else
		System.out.println("Not a Palindrome");
		

	}
}
