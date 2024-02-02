package Package_Examples;

public class Args {
	
	public void mul(int a,int b)
	{
	  int c=a*b;
	  System.out.println("Value is"+c);
	}
	public void div(int x,int y)
	{
	  int d=x/y;
	  System.out.println("Value is"+d);
	}
	public static void main(String args[])
	{
		Args obj= new Args();
		obj.mul(18,2);
		obj.div(75,5);
	}
	}
	


