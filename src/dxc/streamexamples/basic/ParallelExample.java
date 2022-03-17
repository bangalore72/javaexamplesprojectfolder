package dxc.streamexamples.basic;


import java.util.stream.*;


public class ParallelExample {
	
	
	public static void main(String[] args)
	{
		
		IntStream range  = IntStream.rangeClosed(0 , 10);
		
		range.forEach( System.out::println);
		
		
		IntStream range1  = IntStream.rangeClosed(0 , 10);
		
		System.out.println(" In parallel ");
		
		
		range1.parallel().forEach( System.out::println);
		range1.isParallel();
		
		
		

		DoubleStream frange  = DoubleStream.of(10.0 , 20.0);
		
		
		range.forEach( System.out::println);
		
		
		
		
	}
	

}
