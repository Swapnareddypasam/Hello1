package Package_Examples;

public class Class_methodwise {
	public void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}

	public void mul () {
		int x = 5;
		int y =10;
		int z= x+y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Class_methodwise obj = new Class_methodwise();
		obj.add();
		obj.mul();
	}
}
