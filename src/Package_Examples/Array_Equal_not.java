package Package_Examples;

import java.util.Arrays;

public class Array_Equal_not {
	public static void main(String[] args) {
		int[] a = {2,5,6,7};
		
		int[] b = {2,4,6,7};
		 boolean status = Arrays.equals(a, b);
		if (status == true) {
			System.out.println("Both are same");
		}
		else {
			
			System.out.println("Both are not same");

		
				
		}
	}

}
