package Package_Examples;

public class Prime_not {
	
		private static int count;

		public static void main(String args[])
		{
			int i;
			int num=100;
			int count=0;

			for(i=1;i<=num;i++)
				
			{

				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("This is prime number");
			}
			else
			{
				System.out.println("This is not a prime number");
			}
		}
		}


