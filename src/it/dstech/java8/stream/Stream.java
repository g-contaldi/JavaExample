package it.dstech.java8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String args[]) {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		System.out.println("List: " + strings);

		long count = strings.stream().filter(f -> f.isEmpty()).count();
		System.out.println("Empty Strings: " + count);

		// parallel processing
		count = strings.parallelStream().filter(f -> f.isEmpty()).count();
		System.out.println("Empty Strings: " + count);

		count = strings.stream().filter(f -> f.length() == 3).count();
		System.out.println("Strings of length 3: " + count);
		
		List<String> filtered = strings.stream().filter(f -> !f.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered List: " + filtered);

		String mergedString = strings.stream().filter(f -> !f.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList()).forEach(System.out::println);

		List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
		System.out.println("List: " + integers);

		IntSummaryStatistics stats = integers.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());

		System.out.println("Random Numbers: ");
		Random random = new Random();
		random.ints(-50,1000).limit(10).sorted().forEach(System.out::println);

	}

}
