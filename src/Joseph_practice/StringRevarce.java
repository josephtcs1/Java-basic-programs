package Joseph_practice;

public class StringRevarce {
	public static void main(String[] args) {
         //Aprouch-1		
		StringBuffer josh1=new StringBuffer(" sidirnoeunoru");
		StringBuffer str2=josh1.reverse();
		System.out.println(new String(str2));
		//Aprouch-2
		StringBuilder josh = new StringBuilder("asuhhfiefhiu");
		StringBuilder str1=josh.reverse();
		System.out.println(new String(str1));
	
	//Aprouch-3
	String str="joseph";
	char[] str3=str.toCharArray();
	for(int i=str3.length-1;i>=0;i--) {
		System.out.print(str3[i]);
		
	}

}
}
