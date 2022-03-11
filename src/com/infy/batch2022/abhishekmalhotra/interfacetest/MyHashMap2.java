package com.infy.batch2022.abhishekmalhotra.interfacetest;

 
import java.util.*; 

class Employee
{
	String name;

	public Employee(String name)
	{
		this.name = name;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
        return " I am over riding and new implementation " + this.name;
    }

	
}

public class MyHashMap2 {

	public static void main(String args[]) 
	{
		Map<String, Employee> employeeMap = new HashMap<String, Employee>();
		
		//Adding key-value pairs to the map
		employeeMap.put("Data Structures With Java", new Employee("Akshay"));
		//employeeMap.put("Algorithm", new Employee("Deep"));
		
		 
		//Traversing the map
		//entrySet() method is used to retrieve all the key value pairs
		 for(Map.Entry emp:employeeMap.entrySet())
		       System.out.println(emp.getKey()+", "+emp.getValue().toString() );  
		 
	}

}
