/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    //Fibonacii series  ... 1 1 2 3 5 8 13 21 34 55...nth digit n-2 operations
	    
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();   
		 
		 int res= 0;
		 int a = 1;
		 int b = 1;
		 for(int i = 1 ; i<=n-2 ; i++)
		 {
		     res=a+b;

		     a=b;
		     b=res;
		 }
    System.out.println("result : " + res);

	}
}
