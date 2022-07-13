/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
public class Main
{
	public static void main(String[] args) {

    String data = "I love India";
    //write
    try{
    FileOutputStream fos = new FileOutputStream("myFile.txt");
    byte[] res = data.getBytes();
    fos.write(res);
    fos.close();
    }catch(Exception e)
    {
        System.out.println(e);
    }
    
    //Read
    try{
    FileInputStream fis = new FileInputStream("myFile.txt");
    int i=0;
    while((i=fis.read()) != -1)
    {
        System.out.print((char)i);
    }
    }catch(Exception e1)
    {
        System.out.println(e1);
    }
    
	}
}
