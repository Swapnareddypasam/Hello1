package Package_Examples;

public class TC001 {
public static void main(String args[])
{
	String st="nareshit java suresh";
	String[] a=st.split(" ");
	for(int i=0;i<a.length;i++)
	{
		char c=a[i].charAt(0);
		String c1=String.valueOf(c).toUpperCase();
		String sub=a[i].substring(1);
		System.out.print(c1+sub+",");
	}
}
}

