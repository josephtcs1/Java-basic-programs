package Joseph_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollect {
	public static void main(String[] args) {
		List<Integer> number =Arrays.asList(2,3,4,3,6);
   Set<Integer>	result=	number.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(result);
	}

}
