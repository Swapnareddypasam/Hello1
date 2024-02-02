package Package_Examples;

public class Array_onedim {
	public void data() {
		int [] a =  new int [5];
		a[0] = 34;
		a[1] = 24;
		a[2] = 65;
		a[3] = 99;
		a[4] = 100;

		System.out.println("The value of fifth position is" +a[4]);
	}	
        public static void main(String args[])	 {
        
        	Array_onedim obj = new Array_onedim();
        	obj.data();
        }
	}


