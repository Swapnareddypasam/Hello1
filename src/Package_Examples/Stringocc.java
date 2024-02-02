package Package_Examples;

public class Stringocc {

		public static void main(String args[])
		{
			String name ="Java with selenium";
			int count= name.length();
			int K= name.replaceAll("a"," ").length();
			int countnum= count-K;
			System.out.println("The occurance a is"+countnum);
		}
		}

