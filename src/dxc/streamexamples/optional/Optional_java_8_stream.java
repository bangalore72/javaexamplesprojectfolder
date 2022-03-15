package dxc.streamexamples.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
* @author javabeginnerstutorial.com
*/
public class Optional_java_8_stream 
{

	public static void main(String[] args) {

		List<jbt> list = new ArrayList<>();
		list.add(new jbt("name1", 12));
		list.add(new jbt("name2", null));
		list.add(new jbt(null, 12));

		String name = list.stream().map(jbt::getName).filter(Optional::isPresent).map(Optional::orElseThrow)
				.collect(Collectors.joining(","));

		System.out.println(name);

		// Since JDK 9
		name = list.stream().map(jbt::getName).flatMap(Optional::stream).collect(Collectors.joining(","));

		System.out.println(name);

		// orElse method can be used to provide default value incase there is no value
		// present. Like in this case NO_NAME will be provided when name is null.
		name = list.stream().map(jbt::getName).map(name1 -> name1.orElse("NO_NAME")).collect(Collectors.joining(","));

		System.out.println(name);
	}
}

class jbt {

	private String name;
	private Integer age;

	public jbt(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Optional<String> getName() {
		if (name == null) {
			return Optional.empty();
		}
		return Optional.of(name);
	}

	public Optional<Integer> getAge() {
		if (age == null) {
			return Optional.empty();
		}
		return Optional.of(age);
	}
}