package Package_Examples;

import java.util.Scanner;

public class Secondstring_reverse {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("please enter first,second,last");
		String name = sc.nextLine();
		String[] fullnmae = name.split("\\s");
		String first = fullnmae [0];
		String second =fullnmae [1];
		String last = fullnmae [2];
		String com_name = new StringBuilder(last).reverse().toString();
		System.out.println("the first name is "+first);
		System.out.println("the second reverse is "+second);
		System.out.println("the last name is "+com_name);

		
	}
}
