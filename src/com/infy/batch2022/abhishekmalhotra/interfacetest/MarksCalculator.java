package com.infy.batch2022.abhishekmalhotra.interfacetest;



class MarksCalculator {

	public static void calculateAverage(int... marks) {

		if (marks.length != 0) {
			int sum = 0;
			for (int i = 0; i < marks.length; i++) {
				sum += marks[i];
			}
			System.out.println("Average marks: " + sum / marks.length);
		} else {
			throw new ArithmeticException("xxx  ccc  The marks list is not updated");
		}

	}

	
	public static void preCalculateAvg(int... marks) throws Exception {

		try {
			calculateAverage(marks);
		} catch (Exception e) {
			 
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		try
		{
		
			try {
				preCalculateAvg();
			} 
			catch(ArithmeticException arithmeticException) {
				System.out.println(arithmeticException.getMessage());
				throw arithmeticException;
			} 
			catch (Exception exception) {
				System.out.println("Some error occurred");
			}
		
		}
		catch(Exception e)
		{
			System.out.println("Some error occurred, Exiting the program gracefully");
		}
	}
	
	
	
}

// Try executing this code and observe the output.

// Try passing some values as the parameter to the calculateAverage() method and
// observe the output.

// Try throwing an Exception object instead of a ArithmeticException object and
// observe the output.