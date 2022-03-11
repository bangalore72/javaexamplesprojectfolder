package com.infy.batch2022.abhishekmalhotra.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamLength {
	public static void main(String[] args) {

		System.out.println("The stream after applying " + "the function is : ");

		// Creating a list of Strings
		List<String> list = Arrays.asList("abc", "xyzw", "welcome", "Computer", "Science", "govinda");

		// Using Stream map(Function mapper) and
		// displaying the length of each String
		list.stream().map(str -> str.length()).forEach(System.out::println);

	}
}
