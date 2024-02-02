package Package_Examples;

	import java.util.HashMap;
	public class Hashmap{
	public static void main(String args[])
	{
		HashMap<String,Integer>map = new HashMap<>();
		map.put("mon", 1);
		map.put("tue", 2);
		map.put("wed", 3);
		System.out.println("Day in the week is:"+map.get("tue"));
	}
	
	}



