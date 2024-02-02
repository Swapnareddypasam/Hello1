package Package_Examples;

public class Calculations {
	//instance variable
		int a=25;
		String b="DtVar";
		int f=15;
		public void add()
		{
			//local variable
			int c=10;
			int d=30;
			int e=a+c;
			System.out.println(e);
		}
		public void mul()
		{
			System.out.println(a*f);
			System.out.println(b);
		}
		public static void main(String args[])
		{
			Calculations obj= new Calculations();
		    obj.add();
		    obj.mul();
		}
	}



