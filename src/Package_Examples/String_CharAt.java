package Package_Examples;

public class String_CharAt {
	public static void main(String[] args) {
		String name = "my name is swapna";
		char first = name.charAt(9);
		System.out.println(first);
		char second = name.charAt(1);
		System.out.println(second);
		System.out.println("--------"); 
		for(int i = 0;i<name.length();i++)
		{
			char all = name.charAt(i);
			System.out.println(all);
			//System.out.println(all);

			
		}
		
		
	}

}
