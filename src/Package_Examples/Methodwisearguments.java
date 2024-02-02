package Package_Examples;

public class Methodwisearguments {
	public void m1 (int a,int b)
	
	{
		int c = a+b;
		System.out.println("The value is:" +c );
		
	}
	public void m2 (int x,int y)
	{
		int z = x+y;
		System.out.println("The value is:" +z);
		
	}
 public static void main(String args[]) {
	 Methodwisearguments obj = new Methodwisearguments();
	 obj.m1(10,20);
	 obj.m2(30, 40);
 }
}
