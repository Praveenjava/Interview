package in.praveenit.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatStr {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
		Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		collect.forEach((name,count)->
		System.out.println(name+":"+count)
		);
	}

}
