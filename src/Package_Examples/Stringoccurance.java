package Package_Examples;

public class Stringoccurance {
	public static void main(String args[]) {
		String name = "Java with selenium";
		int count = name.length();
		int k = name.replaceAll("s","").length();
		int countnum = count-k;
		System.out.println("The occurance of s: is "+countnum);

	}
	}


