/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int X=0,count=0;
	    Scanner scan = new Scanner(System.in);
	    count=scan.nextInt();
	    for (int i=0; i<count; i++){
		X=scan.nextInt();
		if(X>=30){
		System.out.println("YES");
		}else{
		    System.out.println("NO");
	    }
	    }
	}
}
