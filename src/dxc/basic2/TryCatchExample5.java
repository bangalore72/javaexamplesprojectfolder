package dxc.basic2;



public class TryCatchExample5 {  
	  
    public static void main(String[] args) {  
        try  
        {  
        	int data=50/0; //may throw exception   
        }  
        catch(ArithmeticException e)  
        {  
                  // displaying the custom message  
            System.out.println("Reached ArithmeticException by zero");  
        }   
        catch(RuntimeException e)  
        {  
                  // displaying the custom message  
            System.out.println("RuntimeException ");  
        }  
        catch(Exception e)  
        {  
                  // displaying the custom message  
            System.out.println("Exception");  
        }  
    }  
      
}  
 