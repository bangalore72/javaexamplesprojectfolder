package dxc.streamexamples.serializing.readwrite;

import java.io.*;

class Employee implements Externalizable {
	int id;
	String name;
	String course;
	transient double salary; // This is sensitive, so don't serialize it 

	

	public Employee() {
		 
		
	}
	
	
	public Employee(int id, String name , String course , double salary) {
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
		String str = " id  " + this.id   + " Name: " +
					this.name + " course : " + course + " salary : " 
				 + this.salary ;
		
		return str;
 	}


	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		 out.writeInt(id);
		 out.writeUTF(name);
		
		 out.writeUTF(course);
		 
	  
	}


	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		id =  in.readInt();
		
		name =  in.readUTF();
		
		course =  in.readUTF();
		
	}
}



public class PersistExternizablle {
	public static void main(String args[]) {
		try {
			// Creating the object
			Employee s1 = new Employee(211, "Wills Robin" , "JDBC Course" , 
					Double.valueOf("10000.0" )) ;
			
			
			System.out.println( s1);
			
			
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("/tmp/employee.txt");
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
			Employee s2 = null; 
			// Creating stream and read the object
			FileInputStream fis = new FileInputStream("/tmp/employee.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			
			if( obj instanceof Employee)
			{
				s2 = (Employee)obj;
				
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
