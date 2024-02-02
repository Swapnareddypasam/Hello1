package Package_Examples;

public class Methodwise {
	public void add () {
		int a = 10;
		int b = 20;
		int  c= a+b;
		System.out.println(c);
		
	}
	public void sub () {
		int a = 10;
		int b = 20;
		int  c= a-b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		Methodwise obj = new Methodwise();
		obj.add();
		obj.sub();
	}



}
