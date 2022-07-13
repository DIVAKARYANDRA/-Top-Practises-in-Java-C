/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) throws Exception {
	myThread t = new myThread("Divakar");
	t.start();
		myThread t1 = new myThread("Darling");
        t1.start();
	System.out.println("Working yaar");
	Thread.sleep(6000);
    t.isRun=false;
	}
	public static class myThread extends Thread{
	    
	    boolean isRun = true;
	    String name;
	    public myThread(String name)
	    {
	        this.name=name;
	        System.out.println(name);
	    }
	    @Override
	    public void run()
	    {
	        int c = 0;
	        while(isRun){
	            System.out.println(c);
	            c++;
	            try{
	            Thread.sleep(2000);
	        }
	        catch(Exception e)
	        {
	            System.out.println(" ");
	        }
	        }
	    }
	}
}
