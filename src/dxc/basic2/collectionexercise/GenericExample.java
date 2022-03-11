package dxc.basic2.collectionexercise;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class dummy
{
	String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	public dummy(String s)
	{
		this.name = s;
	}
	
	
	@Override
	public String toString()
	{	
		if(this.name.equalsIgnoreCase("John" ) == true)
		{
			return null;
		}
		
		return name;
	}
	
}


class GenericExample {

	public static void main(String[] args) {
		List nameList = new ArrayList();//Line1
		nameList.add("Harrison");
		nameList.add("Sirius");
		nameList.add("James");
		nameList.add("Lily");
		nameList.add("Cho");
		nameList.add(new dummy("John"));
		nameList.add(new dummy("Viritha"));
		
		 
		//Traversing list through Iterator  
		Iterator itr = nameList.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			if(obj instanceof String)
			{
				System.out.println( (String)obj);
			}
			else if(obj instanceof dummy)
			{
				dummy d = (dummy)obj;
				System.out.println(d.getName());
			}
			
		}
} 
}
