/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    String[] str = {"DIvakar","Harika","dinesh"};
    //String newone = "{"; //immutable
    StringJoiner sj = new StringJoiner(",","{","}");
    sj.setEmptyValue("No Value");
    for(String name : str)
    {
      //  newone+=name + ",";
      sj.add(name);
    }
    //newone+="}";
    System.out.println(sj);
	}
}
