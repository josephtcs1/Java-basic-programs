package Joseph_practice;

import java.util.HashMap;
//import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {
public static void main(String[] args) {
	HashMap<Integer,String> hash=new HashMap<Integer,String>();
	hash.put(1,"mango");
	hash.put(1,"banana");
	hash.put(2, "orange");
	System.out.println("map Iterreting.........");
for(Entry<Integer, String> m:hash.entrySet()) {
System.out.println(m.getKey()+ ""+m.getValue());	
}


HashMap<Integer,String> jos=new HashMap<Integer,String>();
 jos.put(1, "joseph");
 jos.put(2,"JosephJosh" );
 jos.put(3, "kushi");
 System.out.println("Itereting..............");
 for(Entry<Integer,String>f:jos.entrySet()) {
 System.out.println(f.getKey()+""+f.getValue());
 }
}
}
