/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	//pattern
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 5
		
		for(int i = 1; i <= n ; i++) // 5 5<=5
		{
		    
		    
		   for(int j = 1 ; j<=n-i ; j++) //1 1<=0
		    System.out.print(" ");
		    
		    
		    
		    for(int j = 1 ; j<= (2 * i - 1) ; j++) // 1 1<=9
		    if(i==n) //5==5
                System.out.print("*");  //1
            else
                if(j==1 || j==2*i-1) //3==1 || 5==5
                System.out.print("*");
                else
                System.out.print(" ");
		        
		        System.out.println();
		 }
		
	

	}
}
