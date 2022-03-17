package dxc.streamexamples.serializing;

import java.io.Serializable;
import java.io.*;

class Student implements Serializable {
	int id;
	String name;
	String course;
	

	public Student(int id, String name , String course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}
}



public class Persist {
	public static void main(String args[]) {
		try {
			// Creating the object
			Student s1 = new Student(211, "Wills Robin" , "JDBC Course");
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("/tmp/student.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			// closing the stream
			out.close();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
