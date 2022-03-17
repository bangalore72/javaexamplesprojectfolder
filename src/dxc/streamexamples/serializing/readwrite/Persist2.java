package dxc.streamexamples.serializing.readwrite;

import java.io.Serializable;
import java.io.*;

class Student implements Serializable {
	int id;
	String name;
	String course;
	transient double salary; // This is sensitive, so don't serialize it 

	public Student(int id, String name , String course , double salary) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.salary = salary;
		
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}
	
	
	public double getSalary() {
		return salary;
	}


	public void setId(double s) {
		this.salary = s;
	}

	
	@Override
	public String toString()
	{
		String str = "Name : " + this.name + " course : " + course + " salary : " 
				 + this.salary ;
		
		return str;
 	}
}



public class Persist2 {
	public static void main(String args[]) {
		try {
			// Creating the object
			Student s1 = new Student(211, "Wills Robin" , "JDBC Course" , 
					Double.valueOf("10000.0" )) ;
			
			
			System.out.println( s1);
			
			
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("/tmp/student.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			// closing the stream
			out.close();
			System.out.println("success1");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		try {
			// Creating the object
			Student s2 = null; 
			// Creating stream and read the object
			FileInputStream fis = new FileInputStream("/tmp/student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			
			if( obj instanceof Student)
			{
				s2 = (Student)obj;
				
				System.out.println( s2);
				
			}
			
			ois.close();
			// closing the stream
			fis.close();
			
			
			System.out.println("success fully read ");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}
}
