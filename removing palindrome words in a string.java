import java.util.*;
public class Main {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    	//getting the input
		String input = sc.nextLine();
		//using split methods sepearte into words
	    	String[] inputWords = input.split(" ");
		
		//iterate the words
	    	for(String word : inputWords)
		{
			//reverse the string using StringBuilder and reverse()  
		    String reverseWord = new StringBuilder(word).reverse().toString();
		    if(!(word.equalsIgnoreCase(reverseWord))) // check whether it is palindrome and not print
		    {
		        System.out.print(word+" ");
		    }
		}
	}
}