package in.praveenit.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsByLength {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Banana", "Orange", "Graps", "Kiwi", "Mango");

		List<String> collect = str.stream().sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
