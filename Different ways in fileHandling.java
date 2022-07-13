/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.*;
import java.io.FileWriter;
import java.io.FileReader;

public class Main
{
    	  

	public static void main(String[] args) {
	 /*   
	  Scanner sc = new Scanner(System.in);
	 String data = sc.nextLine();
	    try{
	FileOutputStream fos = new FileOutputStream("myFile.txt",true);
	
	byte[] res = data.getBytes();
	fos.write(res);
	fos.close();
	    }
	    catch(Exception e){
	        System.out.println(e.getMessage());
	    }
	 
	 try{
	 FileInputStream fin = new FileInputStream("myFile.txt");
	 int i=0;
	 
	 while((i = fin.read())!=-1)
	 {
	     System.out.print((char)i);
	 }
	 }
	 catch(Exception ee)
	 {
	     System.out.println(ee.getMessage());
	 }
	 */
	 Scanner s = new Scanner(System.in);
	 int d = s.nextInt();
	 switch(d){
	     case 1:
	 writerOn();
	 break;
	    case 2 :
	 readerOn();
        break;
       
	 }
	}
	 static void writerOn(){
	 try{
	     	   Scanner sc = new Scanner(System.in);

	 FileWriter fw = new FileWriter("newFile.txt",true);
	 fw.write(sc.nextLine());
	 
	 fw.close();
	 }
	 catch(Exception ex){
	     System.out.println(ex.getMessage());
	 }
	 }
	 static void readerOn(){
	 try{
	 FileReader fr = new FileReader("newFile.txt");
	 int i=0;
	 
	 while((i = fr.read())!=-1)
	 {
	     System.out.print((char)i);
	 }
	 }
	 catch(Exception ee)
	 {
	     System.out.println(ee.getMessage());
	 }
	 }
	 
}
