package Package_Examples;

public class Constructor {
	public Constructor() {
		System.out.println("This is constructor method");
	}
	public void Hi () {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		obj.Hi();
	}

}
