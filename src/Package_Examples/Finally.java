package Package_Examples;

public class Finally {
	public static void main(String[] args) {
		try {
			int a = 45/5;
			System.out.println("I am  executed");
		
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("At any cost i want to execute");
		}
	}
	}




