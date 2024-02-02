package Package_Examples;

public class Prime {
	public static void main(String[] args) {
		int i,j ;
		int num = 100;
		for(i=1;i<=num;i++) 
		{
			int count =0;
		
		for (j=1;j<=i;j++)
		{
			if (i%j==0);
			{
			count++;
			}
		}
			if(count==2)
			{
				System.out.println(i);
			
			
		}
	}

}
}
