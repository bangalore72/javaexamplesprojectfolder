package dxc.basic2;


interface welcome
{
	public void greet( String user);
	
	default void genericWelcomeMsg()
	{
		System.out.println(" Welcome to the class "  );
	}
}

public class ExampleOnDefaultMethods implements welcome{

	public void greet( String user)
	{
		System.out.println(" Welcome to " + user );
		
	}
	
	
	public static void main(String[] args) {
		
		ExampleOnDefaultMethods obj 
			= new ExampleOnDefaultMethods();
		
		obj.greet(" Zahid");
		
		obj.genericWelcomeMsg();
		
		
	}

}
