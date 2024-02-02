package Package_Examples;

 

	import java.util.Arrays;

	public class Bubblesort_order {

		public static void main(String[] args) {
			int[] a= {4,6,7,8,9,1,2,8,9};
			System.out.println("Before sorting :"+Arrays.toString(a));
			int s=a.length;
			//print order sort
			for(int i=0;i<s-1;i++)
			{
				for(int j=0;j<s-1;j++)
				{
					if(a[j]>a[j+1])
					{
						int k=a[j]; 
						a[j]=a[j+1];     
						a[j+1]=k;
					}
				}
			}
			System.out.println("After sorting: "+Arrays.toString(a));
		}
	}
	
