package in.praveenit.string;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String str = "Hello";
		String collect = str.chars().mapToObj(c->(char)c).collect(Collectors.toCollection(LinkedHashSet::new)).stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(collect);
	}

}
