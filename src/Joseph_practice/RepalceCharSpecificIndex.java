package Joseph_practice;

public class RepalceCharSpecificIndex {
	public static void main(String[] args) {
		
	String str ="Joseph josh";
	int index=7;
	 String ch = "King";
	 System.out.println("original string  "  +str);
	 str=str.substring(0, index) +ch + str.substring(index+1);
	 System.out.println(str);
	 
	 
	}
}
