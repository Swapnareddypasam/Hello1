package Package_Examples;

public class First_uppercase {
	public static void main(String[] args) {
		//store the data
		String name="selenium";
		//print first uppercase
		String first=name.substring(0,1);
		//String second=name.substring(0,1);

		//remainig letters
		String remain=name.substring(1,name.length());
		//print upper case
		String k=first.toUpperCase();
		//String k1=second.toUpperCase();

		//print full name
		String name1=k+remain;

		//String name1=k+k1+remain;
		
		System.out.println("The first letter is:"+name1);

	}

}


