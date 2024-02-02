package Package_Examples;

public class range {


		public static void main(String[] args) {
			for(int i=1;i<=100;i++)
			{
				if(containsSeven(i))
				{
					
				
				System.out.println(i);
				
				}
			}

		}

		private static boolean containsSeven(int number) {
		
			while(number>0)
			{
				int digit=number%10;
				if(digit==7)
				{
					return true;
					
				}
				number/=10;
			}
			return false;
		}

	

	

}
