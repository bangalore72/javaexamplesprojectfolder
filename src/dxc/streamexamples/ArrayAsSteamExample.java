package dxc.streamexamples;



import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class Employee
{
	String name;
	int  age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Employee( String name , int age)
	{
		this.name =  name;
		this.age =  age;
	}
	
	
	public String toString()
	{
		return this.name;
	}
	
}

public class ArrayAsSteamExample {

	
	public static void main(String args[])
	{
		List<String> castList = List.of("Sam","Dean","Castiel","Crowley");
		
		
		Stream<String> supernatural = castList.stream();
		
		supernatural.forEach(System.out::println);
		
		 
		castList.stream().forEach( e -> System.out.println( e));
		
		
		 
		// Creating a list of Integers
		List<String> list1 = Arrays.asList( "Sam","Dean","Castiel","Crowley");

		
		// Creating a list of Integers
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

		// Using forEach(Consumer action) to
		// print the elements of stream
		// in reverse order
		list.stream().sorted(Comparator.reverseOrder()).
			forEach(System.out::println);
		
				
		
		List<Employee> empList = new ArrayList<>();
		empList.add( new Employee( " Ragh" , 21 ));
		empList.add( new Employee( " Ragh1" , 22 ));
		
		Stream<Employee> s  = empList.stream();
		
		s.forEach(System.out::println);
		
		
	}
} 
