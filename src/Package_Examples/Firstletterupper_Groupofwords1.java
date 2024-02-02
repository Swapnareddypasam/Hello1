package Package_Examples;

public class Firstletterupper_Groupofwords1 {
	public static void main(String[] args) {
		String name = "java selenium python";
		String replace = name.replaceAll(name, name);
         String [] word = replace.split(" ");
         for (String words:word) {
        	 System.out.println("The first letter is "+ words.substring(0,1).toUpperCase()+words.substring(1,words.length()));
        	 
         }
         
		}

}
