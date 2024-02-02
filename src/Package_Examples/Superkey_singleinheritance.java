package Package_Examples;

	class Amazon {
		public void drama () {
			System.out.println("Super hit drama");
		}
	}
		class flip extends Amazon {
			public void drama1 () {
				System.out.println("Super hit drama1 ");
			}
		}
			public class Superkey_singleinheritance {
				public static void main(String[] args) {
					
				
				flip obj = new flip();
				obj.drama();
				obj.drama1();
				

		}
			}
	

