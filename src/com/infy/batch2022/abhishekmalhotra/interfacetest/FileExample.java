package com.infy.batch2022.abhishekmalhotra.interfacetest;

import java.io.*;

public class FileExample {

 
	public static void main(String args[]) {

		String ageStr = "13";

		
		try {
			int age = Integer.parseInt(ageStr);

			System.out.println("Age is number" + age);
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 

		 
		try {
			FileReader fr = new FileReader("/tmp/testout.txt");
			int i;
			while ((i = fr.read()) != -1)
				System.out.print((char) i);
			fr.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 
	}
}
