package Package_Examples;

public class Threedimensional_Array1  {

	public static void main(String args[]) {
		 int[][][] arr = new int[2][3][5];
		 
		      
		      for(int i=0; i<2; i++)
		      {
		         for(int j=0; j<3; j++)
		         {
		            for(int k=0; k<5; k++)
		            {
			            
		            	arr[i][j][k]=i+j+k;
		               System.out.println( arr[i][j][k]); 
		            
		           // System.out.print("\n");
		         }
		      }
		   
		     
		      }

}
}