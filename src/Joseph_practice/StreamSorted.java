package Joseph_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {
	public static void main(String[] args) {
		List<String> sort=Arrays.asList("king","koshi","anuska","Balu");
		List<String> result =sort.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
		
	}

}
