package com.infy.batch2022.abhishekmalhotra;


interface Search
{
	
	String getSearchData(String input );
	
}



class YahooSearch implements Search{

	@Override
	public String getSearchData(String input) {
		
		
		String result  = getDataFromSearchRepository();
		
		return result;
	}

	public String getDataFromSearchRepository()
	{
		//Create Yahoo Object then do search
		String s = "Yahoo - Returning Result now  ; Cow";
		return s;
	}

 
}



class GoogleSearch implements Search{

	@Override
	public String getSearchData(String input) {
		
		
		String result  = getDataFromSearchRepository();
		
		return result;
	}

	public String getDataFromSearchRepository()
	{
		//Create Google Object then do search
		String s = "Google - Returning Result now Lion";
		return s;
	}

 
}



public class SearchTester {

	public SearchTester() {
		 
		
	}

	
	public static void main(String[] args)
	{
		Search object  = new YahooSearch();
		
		Search object2  = new GoogleSearch();
		
		
		String s = object.getSearchData("carnivorus animal");
		
		System.out.println(" Result : " + s);
		
		
		s = object2.getSearchData("carnivorus animal");
		
		System.out.println(" Result : " + s);
		
	}
	
	static Search getInstance()
	{
		return new GoogleSearch();
	}
}
