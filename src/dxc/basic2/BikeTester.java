package dxc.basic2;


interface drive
{
	public void drives();
	
}

abstract class MotorBike implements drive {
	  abstract void brake();
	  
	  public void drives()
	  {
		  System.out.println("yes I am ready to go for a drive");
	  }
	}

	class SportsBike extends MotorBike {
	    
	  // implementation of abstract method
	  public void brake() {
	    System.out.println("SportsBike Brake");
	  }
	}

	class MountainBike extends MotorBike {
	    
	  // implementation of abstract method
	  public void brake() {
	    System.out.println("MountainBike Brake");
	  }
	}

	 
	
	
public class BikeTester 
{
	 public static void main(String[] args) {
		    MountainBike m1 = new MountainBike();
		    m1.brake();
		    SportsBike s1 = new SportsBike();
		    s1.brake();
		    
		    s1.drives();
		  }
}

