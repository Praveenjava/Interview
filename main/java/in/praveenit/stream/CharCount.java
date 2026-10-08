package in.praveenit.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount {
	public static void main(String[] args) {
		String str = "Praveen";
		Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		collect.forEach((character,count)->
			System.out.println(character+":"+count));
		
	}

}
