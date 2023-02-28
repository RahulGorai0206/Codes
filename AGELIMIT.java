/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan =new Scanner(System.in);
		int count = scan.nextInt();
		int age=0,min_age=0,max_age=0;
		for (int i=0;i<count;i++){
    		min_age = scan.nextInt();
    		max_age = scan.nextInt();
    		age = scan.nextInt();
    		if(age>=min_age && age<max_age){
    		    System.out.println("YES");
    		}else{
    		   System.out.println("NO"); 
    		}
		}
	}
}
