/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
            Runnable newRunnable = (x,y)->{
                System.out.println("x:" + x);
                System.out.println("y:" + y);
                System.out.println("Divakar is Working");
                System.out.println("God also Helping");
            };
            newRunnable.run(8,10);
            
    	}
    	@FunctionalInterface
    	interface Runnable{
    	    public abstract void run(int x , int y);
    	}
}
