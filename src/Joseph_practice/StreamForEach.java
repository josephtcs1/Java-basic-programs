package Joseph_practice;

import java.util.Arrays;
import java.util.List;

public class StreamForEach {
	public static void main(String[] args) {
		List<Integer> num =Arrays.asList(2,4,5,3,5);
	   num.stream().map(x->x*x).forEach(y->System.out.println(y));
		
	}

}
