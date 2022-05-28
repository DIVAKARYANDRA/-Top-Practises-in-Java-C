/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	// wap to  print even numbers between 1 and 100 in ascending order and descending order
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.println("Even in ascending");
	for(int i = 1 ; i<=n ; i++)
	{
	    if(i%2  == 0 )
	    System.out.print( i + " ");
	}
	System.out.println();
	
	System.out.println("Even in descending");
	for(int i = n ; i>0 ; i--)
	{
	    if(i%2  == 0 )
	    System.out.print( i + " ");
	}
	
	
	
	
	
	
	}
}
