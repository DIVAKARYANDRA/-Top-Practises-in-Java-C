/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
    // wap that reads a sequence of integers from the user and stops by displaying "Done" when the sum of these values exceeds 100
	
	Scanner sc = new Scanner(System.in);
	int sum=0;
	while(true)  //infinite loop
	{
	    System.out.print("Enter a number : ");
	    //20
	    sum +=  sc.nextInt(); // sum= sum + a
	    
	    if(sum > 100)
	    break;
	}
	System.out.println("Done : " + sum);
	}
}
