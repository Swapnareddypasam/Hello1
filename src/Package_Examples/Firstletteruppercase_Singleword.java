package Package_Examples;

public class Firstletteruppercase_Singleword {
	public static void main(String[] args) {
		String name = "selenium";
		String firstname = name.substring(0,1);
		String remaining = name.substring(1,name.length());
		String k = firstname.toUpperCase();
		String fullname = k+remaining;
		System.out.println("The complete is :"+fullname);
	}

}



