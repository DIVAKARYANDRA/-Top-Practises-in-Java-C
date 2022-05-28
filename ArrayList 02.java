/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 
	 ArrayList<Integer> integers = new ArrayList<>();
	 
	while(true)
    {
        System.out.println("Choose an option" + "\n" + "1.Add" + "\n" + "2.Remove" + "\n" + "3.Display" + "\n" + "4.Exit");
        System.out.print("Your choice : ");
        int temp = sc.nextInt();
        
        if(temp==1)
        {
        
        System.out.print("Enter an integer input : ");
        integers.add(sc.nextInt()); //5
        System.out.print("Added" + "\n");
        
        }
        else if(temp==2)
        {
            System.out.print("Enter an integer to remove : ");
            int a = sc.nextInt();  //5
            
            if(integers.contains(a))
            {
            integers.remove(Integer.valueOf(a));  //new Integer(a)   or remmove can be executed like this
            System.out.println("Removed");
            }
            else
            System.out.println("Not found");
        }
        else if(temp==3)
        {
            System.out.println("Your List : " + integers);
        }
        else if(temp == 4)
        {
            System.out.println("Good Bye");
            break;
        }
        else
        {
            System.out.print("Wrong input");
            break;
        }
        
    }

	}
}
