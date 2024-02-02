package Package_Examples;

public class Max_min {



			public static void main(String[] args) {
				//store the values in side int array
				int[] a= {45,12,4,8,12,56,89,16};
				int max=a[0];
				//loop
				for(int i=0;i<a.length;i++)
				{
					if(a[i]>max)
					{
						max=a[i];
					}
				}
				System.out.println("The max value is:"+max);

			}

		}




