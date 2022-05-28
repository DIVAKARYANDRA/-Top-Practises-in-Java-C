/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    //wap to check whether the given num is prime or not
	    
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		
		
		
		int sum = 0;
		for(int i = 2 ; i<=a/2 ; i++) 
		{
		    if(a % i == 0) 
		    sum = sum + i; 
		    break;
		}
		
		
		System.out.println(sum==0 ? "Prime" : "Not prime");
		
	}
}
