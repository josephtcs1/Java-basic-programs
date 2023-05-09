package Joseph_practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
   public static void main(String[] args) {
	HashSet<String> set=new HashSet<String>();
	set.add("King");
	set.add("joseph");
	set.add("King");
	set.add("Kohli");
	set.add("King");
	 Iterator<String> i=set.iterator();  
	 while(i.hasNext()) {
		 System.out.println(i.next());
	 }
	
}
}
