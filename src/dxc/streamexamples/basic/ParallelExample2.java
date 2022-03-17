package dxc.streamexamples.basic;


import java.util.stream.*;
import java.util.*;


public class ParallelExample2 {
	
	
	public static void main(String[] args)
	{
		
		List<String> list  = getData();

		System.out.println(" Not parallel " );
		
		list.stream().forEach( e -> System.out.println( e));
		
		
		
		System.out.println(" -- In  parallel --" );
		
		list.parallelStream().forEach( e -> System.out.println( e));
		
		
		
	}
	
	 
	public static List<String> getData()
	{
		List<String> list = new ArrayList<>();
		
		int n=97;
		
		while( n <=122) {
			char c =  (char)n;
			list.add(String.valueOf(c));
			n++;
		}
		
		
		return list;
		
	}
 
}
