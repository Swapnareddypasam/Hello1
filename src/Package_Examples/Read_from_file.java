package Package_Examples;

	import java.io.BufferedReader;
	import java.io.FileReader;

	public class Read_from_file {
	public static void main(String args[])throws Exception
	{
		FileReader file= new FileReader("\"C:\\Users\\venka\\OneDrive\\Desktop\\RRR.xlsx\"");
		BufferedReader br= new BufferedReader(file);
		String str;
		while((str=br.readLine())!= null)
		{
		System.out.println(str);	
		}
	}
	}

