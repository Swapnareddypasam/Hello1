package Package_Examples;

	import java.util.Scanner;
	public class Palindrome {

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the palindrum");
		int num= sc.nextInt();
		int con=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(con==rev)
		{
			System.out.println("This is palindrum");
		}
		else
		{
			System.out.println("This is not a palindrum");
		}
	}
	}


