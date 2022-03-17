package dxc.streamexamples.basic;

import java.util.*;
import java.util.Map.Entry;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Book {
	
	private String name;
    private int releaseYear;
    private String isbn;
    
    
    public Book( String name , int releaseYear , String isbn )
    {
    	  this.name = name;
    	  this.releaseYear = releaseYear; 
    	  this.isbn = isbn;
        
    }
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
	}
	
     
}


public class StreamToCollectorMapExample {
	
	public static void main(String []args)
	{
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
		bookList.add(new Book("The Two Towers", 1954, "0345339711"));
		bookList.add(new Book("The Return of the King", 1955, "0618129111"));

		Map<String, String> map 
			= bookList.stream().
				collect(Collectors.toMap(Book::getIsbn, Book::getName));
		
		
		System.out.println(" " + map);
		
		
	 
		for (Entry<String, String> entry : map.entrySet()) 
		{
			String isbn  = entry.getKey();
			String  name = entry.getValue();
			System.out.println( isbn +" : "+ name);
		}
		
		
		///

		String[][] twoArrayData = 
				new String[][] 
						{ { "A", "Apple" }, { "B", "Boy" }, { "C", "Cat" } };
						
		
		Stream<String[]> myStream = Stream.of(twoArrayData);
		
		
		Map<String , String> resultMap = 
				myStream.collect( Collectors.toMap( p -> p[0], p -> p[1]) );
		

		for (Entry<String, String> entry : resultMap.entrySet()) 
		{
			String k  = entry.getKey();
			String  v = entry.getValue();
			System.out.println( k +" : "+ v);
		}
		
						

	}

}
