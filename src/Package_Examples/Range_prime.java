package Package_Examples;

import java.util.Scanner;

public class Range_prime {
	public static void main(String args[])
	{
		int min,max,i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter minimum value");
		min=sc.nextInt();
		System.out.println("Enter maximum value");
		max=sc.nextInt();
	    for(i=min;i<max;i++)
	    {
	    	 for(j=2;j<i;j++)
	    	 {
	    		 if(i%j==0)
	    			 break;
	    	        }
	    			 if(i==j)
	    			 {
	    				 System.out.println("value is"+j);
	    			 }
	    			 else {
	    				 System.out.println("no prime number");
	    			 }
	    		 }
	    	 }
	    
	}



