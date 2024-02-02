package Package_Examples;

	class Amazon6 {
		public void drama () {
			System.out.println("super hit drama");
			
		}
	}
	class flip1 extends Amazon6 {
		public void drama () {
			super.drama();
			System.out.println("super hit drama2");
		}
	}
	public class Superkey_methodoverride{
		public static void main(String[] args) {
			
		
		flip1 obj = new flip1();
		obj.drama();
		
	}
	}
	


