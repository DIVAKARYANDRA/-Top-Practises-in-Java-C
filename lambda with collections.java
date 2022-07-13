/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	ArrayList<Login> newone = new ArrayList<>();
	newone.add(new Login("DIvakar","1245"));
	newone.add(new Login("Harika","7862"));
	
    System.out.println("By ForEach way");

    for(Login logo : newone)
    {
        System.out.println(logo.username + " " + logo.password);
    }
    System.out.println("By Iterating way");
    Iterator<Login> i = newone.iterator();
    while(i.hasNext()){
        Login login  = i.next();
        System.out.println(login.username + " " + login.password);
    }
    System.out.println("By Lambda Way");
    newone.forEach(loginInfo->{
        System.out.println(loginInfo.username);
        System.out.println(loginInfo.password);
        }
        );
	}
}
