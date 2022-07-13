/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	ArrayList<Person> str = new ArrayList<>();
	str.add(new Person("Divakar",8));
	str.add(new Person("Programmer",3));
	str.add(new Person("Boy",5));
	
	System.out.println("Before Sort");
	sorted(str);
	
    Collections.sort(str);
    
	System.out.println("After Sort");
	sorted(str);

	}
	static void sorted(ArrayList<Person> str){
	    for(Person name:str){
	System.out.println(name.names);
	System.out.println(name.age);
	    }
	}
}
 class Person implements Comparable<Person>
{
    String names;
    int age;
    public Person(String names,int age)
    {
        this.names = names;
        this.age = age;
    }
    @Override
    public int compareTo(Person o)
    {
        return this.age - o.age;
    }
    
}
