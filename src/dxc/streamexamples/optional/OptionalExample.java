package dxc.streamexamples.optional;

import java.util.Optional;

public class OptionalExample {

	public static void nonOptional() {

		try {
			String[] str = new String[10];
			String lowercaseString = str[5].toLowerCase();
			System.out.print(lowercaseString);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void usingOptional() {

		try {
			String[] str = new String[10];
			Optional<String> checkNull = Optional.ofNullable(str[5]);
			
			if (checkNull.isPresent()) 
			{ 
				// check for value is present or not
				String lowercaseString = str[5].toLowerCase();
				System.out.print(lowercaseString);
			} 
			else
				System.out.println("string value is not present");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		nonOptional();

		usingOptional();

	}
}