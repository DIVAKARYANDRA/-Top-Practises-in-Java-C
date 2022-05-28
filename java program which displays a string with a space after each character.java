/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    //wap which displays a string with a space after each character
	    //abcd = a b c d  .....
	    //some text = s o m e   t e x t 
		Scanner sc = new Scanner(System.in);
		 String n = sc.nextLine();  //abcd 
		 
		
		for(int i = 0 ; i<n.length() ; i++)
		{
		    System.out.print(n.charAt(i) + " ");
		}
		
		
		
	}
}
