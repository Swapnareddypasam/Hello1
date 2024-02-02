package Package_Examples;

public class Word_letter_upcase {
		public static void main(String args[])
		{
			String st ="beAutiful";
			String [] arr=st.split(" ");
			for(int i=0;i<arr.length;i++)
			{
				char c = arr[i].charAt(0);
				String c1=String.valueOf(c).toUpperCase();
				String sub=arr[i].substring(1);
				System.out.print(c1+sub);

			}
		}
		
	}


