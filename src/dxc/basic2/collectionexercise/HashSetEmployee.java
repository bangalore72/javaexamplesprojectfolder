package dxc.basic2.collectionexercise;

import java.util.*;

class Employee
{
	String name;
	String id;
	Employee( String name, String id)

	{
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object o) {
	    if (o == this)
	        return true;
	    if (!(o instanceof Employee))
	        return false;
	    Employee other = (Employee)o;
	    
	    boolean equals = (this.name == null && other.name == null)
	      || (this.id != null && this.id.equals(other.id));
	    return equals;
	} 
	
	
	
	
	@Override
	public final int hashCode() {
	    int result = 17;
	    if (name != null) {
	        result = 31 * result + name.hashCode();
	    }
	    if (id != null) {
	        result = 31 * result + id.hashCode();
	    }
	    return result;
	}
	
	
}



class HashSetEmployee {
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		HashSet<Employee> set = new HashSet<>();
		
		
		set.add(new Employee("Ravi", "10")); 
		
		set.add(new Employee("Ajay", "11"));  
		set.add(new Employee("Ajay", "10")); 
		set.add(new Employee("Venkat", "10")) ;
		
		set.add(new Employee("Ravi", "10")); 
		 
		
		// Traversing elements
		Iterator<Employee> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}



