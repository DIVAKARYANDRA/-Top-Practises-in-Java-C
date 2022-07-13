/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i<n;i++)
		arr[i]=sc.nextInt();
	int c=0;
		
		for(int i=0;i<n;i++){
		boolean isThere1 = false;
		boolean isThere2 = false;
		boolean isThere3 = false;
		
		   int temp = arr[i];
		    while(temp!=0){
		    int rem = temp%10;
		    if (rem==1)
		    isThere1= true;
		    if(rem==2)
		    isThere2 = true;
		    if(rem==3)
		    isThere3 = true;
		    temp/=10;
		    }
		    
		    if(isThere3 && isThere2 && isThere1)
		    System.out.print(arr[i] +" ");
		    else
		    c++;
		    
		}
		if(c>=n)
		System.out.println(-1);
		
	}
}
