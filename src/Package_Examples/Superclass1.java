package Package_Examples;

class Shailu {
	Shailu()
	{
		System.out.println("this is constructor");
		
	}
		
	}
	class Swapna extends Shailu{
		Swapna() 
		{
			super();
			System.out.println("this is child constructor");
			
		}
	}


public class Superclass1{
	public static void main(String[] args) {
		Swapna obj= new Swapna();
		
		
	}
	
}

