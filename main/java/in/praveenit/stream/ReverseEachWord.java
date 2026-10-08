package in.praveenit.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {
	public static void main(String[] args) {
		String[] cities = { "Hyderabad", "Banglore", "Chennai", "Mumbai" };
		List<String> collect = Arrays.stream(cities).map(city -> new StringBuilder(city).reverse().toString())
				.collect(Collectors.toList());
		System.out.println(collect);

	}

}
