package dxc.streamexamples.basic;

import java.util.*;


public class StringJoinerExample {

	
	public static void main(String args[])
	{
		
		StringJoiner namesList = new StringJoiner("|");
		
		
		namesList.add( "A");
		namesList.add( "B");
		

		System.out.println(namesList);
		
	}
}


//a,b,c