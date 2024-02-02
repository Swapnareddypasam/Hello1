package Package_Examples;

	class A {
	public void	m1() {
			System.out.println("m1 is executed");
	}
	
		}
	class B extends A {
		
		public void m2() {
			System.out.println("m2 is executed");
		}

	}
	public class Superclass_SLI {
    public static void main(String[] args) {
	B obj= new B();
	obj.m1();
	obj.m2();
    }
	}

	
