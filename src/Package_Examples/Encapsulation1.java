package Package_Examples;

public class Encapsulation1 {
	
		private String emp_name;
		private int emp_id;
		private int emp_sal;
		public void A1(String name)
		{
			this.emp_name =name;
		}
		public String get_name()
		{
			return emp_name;
		}
		public void A2(int id)
		{
			this.emp_id =id;
		}
		public int get_id()
		{
			return emp_id;
		}
		public void A3(int sal)
		{
			this.emp_sal =sal;
		}
		public int get_sal()
		{
			return emp_sal;
		}
		public static void main(String args[])
		{
			Encapsulation1 obj= new Encapsulation1();
			obj.A1("Lakshmi");
			obj.A2(12);
			obj.A3(35000);
			System.out.println(obj.get_name());
			System.out.println(obj.get_id());
			System.out.println(obj.get_sal());
		}
		}



 