package Package_Examples;

public class Swapping {


		public static void main(String[] args) {
			int a=40,b=30;
			System.out.println("Before Swaping:"+a+" "+b);
			int l=a;
//			a=b;
//			b=l;
//			l=b;
			a=a+b;//a=70
			b=a-b;//b=70-30=40
			a=a-b;//a=70-40=30
			System.out.println("After swapping:"+a+" "+b);

		}

	}



