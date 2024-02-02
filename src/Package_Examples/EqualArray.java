package Package_Examples;

	import java.util.Arrays;

	public class EqualArray {
	public static void main(String args[])
	{
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40,50};
		boolean status= Arrays.equals(a,b);
		if(status==true)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
	}
	}


