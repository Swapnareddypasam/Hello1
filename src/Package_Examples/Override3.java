package Package_Examples;

public class Override3 extends Override2 {
	
	public void add (int a , int b)
	
	{
		int c = a+b;
		System.out.println(c);
	}
    public static void main(String args[])
		{
			Override3 obj= new Override3();
			obj.add(30,20);
		}
	}


