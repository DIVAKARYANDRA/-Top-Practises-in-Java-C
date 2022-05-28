/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	/* wap to enter a number from user between 1 and 10 
	
	Enter  a number : 12
	12 is not in between 1 and 10 : -5
	-5 is not in between 1 and 10 : 6
	6 is the number between 1 and 10 ! Done.
	
	*/
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int n = sc.nextInt(); //8
	
	while(n > 10 || n < 1 )
	{
	    System.out.print(n + " is not in between 1 and 10 : ");
	    n = sc.nextInt();  //6
	}
	System.out.print(n + " is the number between 1 and 10 : Done");
	
	    
	}
}
