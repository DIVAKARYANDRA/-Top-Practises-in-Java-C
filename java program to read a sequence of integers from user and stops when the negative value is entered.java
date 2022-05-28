/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    //wap to read a sequence of integers from user and stops when the negative value is entered 
	    // print the max and min of entered numbers
	    
		Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt(); //first input
		 int max = a; //max=52;
		 int min = a; //min = 52;
	if(a>=0){	
	for(;;)  //for infinite loop
	{
	     a = sc.nextInt(); //62  1  -7
	    
	    if(a<0)
	    break;
	    
	    if(a> max) //62>52  
	    max=a;  //max=62
	    
	    if(a<min)  //62<52  1<52
	    min=a;  //min=1
	    
	    
	    
	    
	}
		
		
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
	}
	else
	{
	    System.out.println("Invalid");
	}
	}
}
