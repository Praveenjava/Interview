package in.praveenit.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepetedChar {
	public static void main(String[] args) {
		String str = "Hello World";
		
		Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		collect.entrySet().stream().filter(entry->entry.getValue()>1)
		.forEach(entry->System.out.println(entry.getKey()+":"+entry.getValue()));
	}

}
