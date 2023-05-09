package Joseph_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2,3,4,5);
		List Squere = number.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(Squere);
	}

}
