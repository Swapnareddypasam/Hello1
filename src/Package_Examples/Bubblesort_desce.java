package Package_Examples;

	

	import java.lang.reflect.Array;
	import java.util.Arrays;
	import java.util.Collections;

	public class Bubblesort_desce {

		public static void main(String[] args) {
			Integer[] a= {3,5,6,1,2,4,8,7,9};
			System.out.println("Before Desending order:"+Arrays.toString(a));
			Arrays.sort(a,Collections.reverseOrder());
			System.out.println("After Desending order:"+Arrays.toString(a));

		}

	}



