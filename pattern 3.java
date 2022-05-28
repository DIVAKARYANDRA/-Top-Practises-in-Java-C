/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();  // 5
		
		for(int i=1;i<=n;i++) //2  2<=5
		{
		    if(i==1 || i==n)
		    for(int j=1;j<=n;j++)
		    System.out.print("*");
		    
		    
		    else
		    for(int j=1;j<=n;j++)  //2  2<=5
		    {
		   if(j==1 || j==n)  //i=2  j=2
		    System.out.print(" ");
		    else
		    System.out.print("*");
		    }
		    System.out.println();
		}
		
		
		
	}
}
