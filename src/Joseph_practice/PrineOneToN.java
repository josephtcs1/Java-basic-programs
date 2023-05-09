package Joseph_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrineOneToN {
	public static void main(String[] args) {
		List<String> josh =  Arrays.asList("joseph","josh","KING");
		 List <String> s = josh.stream().filter(a ->a.startsWith("j")).collect(Collectors.toList());
		 System.out.println(s);
		 
		 List<Integer> jo = Arrays.asList(2,33,5,6,8);
		 List <Integer> joo = jo.stream().map(a->a*a).collect(Collectors.toList());
		 System.out.println(joo);
		 
		 List<Integer> king = Arrays.asList(2,3,4,5,6,7);
		 king.stream().map(x->x*x*x).forEach(y->System.out.println(y));
		
	
	}

}
