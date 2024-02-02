package Package_Examples;

public class Firstletterupper_Groupofwords {



		public static void main(String args[])
		{
			String st ="java selenium phyton";
			String [] arr=st.split(" ");
			for(int i=0;i<arr.length;i++)
			{
				char c=arr[i].charAt(0);
				String c1=String.valueOf(c).toUpperCase();
				String sub=arr[i].substring(1);
				System.out.println(c1+sub+",");
			}
		}
		


	}



