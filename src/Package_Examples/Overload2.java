package Package_Examples;

public class Overload2 {
	
		public void add(int a,int b)
		{
			System.out.println(a+b);
		}
		public void add(int a,int b,int c)
		{
			System.out.println(a+b+c);
		}
		
	public static void main(String args[])
	{
		Overload2 obj= new Overload2();
		obj.add(10,20);
		obj.add(80,10,15);

	}
	}


