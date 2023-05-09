package Joseph_practice;

public class RemovingWhiteSpaceInString {
	public static void main(String[] args) {
		String str ="  ja va st ar  ";
//		 String str1=str.trim();
//		 System.out.println(str1);   it is for only outside trim
		
		String str2=str.replaceAll("\\s","");
		System.out.println(str2);
	}

}
