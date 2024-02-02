package Package_Examples;

public class Reverse_string {

		public static void main(String args[])
		{
		   String name= "Satish";
		   String str=" ";
		   int count= name.length();
		   for(int i=count-1;i>=0;i--)
		   {
			   str=str+name.charAt(i);
		   }
		   System.out.println("The reverse string is"+str);
		}
		}


