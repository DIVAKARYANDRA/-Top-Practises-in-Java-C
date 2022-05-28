/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
// wap which displays the sum of digits of an integer from user
	    
		Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();   //108
	int sum=0,rem;
	while(a>0) //0>0
	{
	    rem = a % 10; // 1%10
	    sum += rem; //9
	    a /= 10;  //0
	}
	
	System.out.println(sum);
	    
	
	}
}
