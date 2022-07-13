import java.util.*;
public class Main {  
    static String a="Null";
      static String b="Null";
    public static void main(String[] args) {  
          Scanner sc =new Scanner(System.in);
          String str = sc.nextLine();  
  
        //Stores the length of the string  
        int len = str.length();  
        //n determines the variable that divide the string in 'n' equal parts  
        int n1 = len/2;
        int n = len/n1;
        int temp = 0, chars = len/n;  
        //Stores the array of string  
        String[] equalStr = new String [n];  
        //Check whether a string can be divided into n equal parts  
        if(len % n != 0) {  
        System.out.println("False");
        }  
        else {  
            for(int i = 0; i < len; i = i+chars) {  
                //Dividing string in n equal part using substring()  
                String part = str.substring(i, i+chars);  
                equalStr[temp] = part;  
                temp++;  
            }  
                       for(int i = 0; i < 2; i++) {  
                if(i==0)
                a=equalStr[i];
                if(i==1)
                b=equalStr[i];
                }  
            }  
           if(a.equals(b))
            System.out.println("True");
           else
            System.out.println("False");

        }  
}  