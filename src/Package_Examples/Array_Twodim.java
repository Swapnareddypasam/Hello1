package Package_Examples;

public class Array_Twodim {
	public void data() {
		int[][] a = new int[2][2];
		a[0][0] =20;
		a[0][1] = 30;
		a[1][0] = 40;
		a[1][1] = 50;

	System.out.println("The value of second position is" +a[1][1]);	
	}
	public static void main(String[] args) {
		Array_Twodim obj = new Array_Twodim();
		obj.data();
	}
		
	}


