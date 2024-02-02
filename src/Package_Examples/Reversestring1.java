package Package_Examples;

public class Reversestring1 {
	public static void main(String[] args) {
		
		String a1 = "8919384099";
		String a2 = "";
		
		for(int i=a1.length()-1; i>=0; i--)
		{
			char c = a1.charAt(i);
			a2=a2+c;
		}
		System.out.println(a2);

	}
	}




