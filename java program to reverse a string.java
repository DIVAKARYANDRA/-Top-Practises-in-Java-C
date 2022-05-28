/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		//wap to reverse a string  
		// some text = txet emos 
		
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); //diva
		String rev = "";  //
		for(int i = str.length()-1  ; i>=0  ; i-- )
		{
		  rev = rev + str.charAt(i);  //avid
		}
		  System.out.print(rev);
	}
}
