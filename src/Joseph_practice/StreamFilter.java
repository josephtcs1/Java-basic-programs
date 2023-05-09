package Joseph_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
	public static void main(String[] args) {
		   List<String> names = Arrays.asList("jseph","rakesh","rajiv","john");
		   List <String> result=names.stream().filter(s->s.startsWith ("r")).collect(Collectors.toList());
		   System.out.println(result);

		
	}
}
