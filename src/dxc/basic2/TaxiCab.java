package dxc.basic2;

interface PublicTransport{
    double RATE = 12.0; // Rate per km
    double MIN_AMOUNT = 30.0;
    double calculateFare();
}

class Car {
    String brand;
    String color;
    String model;
}



 class OlaCab extends Car implements PublicTransport{
    public double calculateFare() {    // Implementing interface's method
        double billAmount = MIN_AMOUNT + (RATE * getTravelDistance());
        if(billAmount > 100.0)
        {
        	billAmount = billAmount - ( 0.10* billAmount);
        	
        }
        return billAmount;
    }
    public double getTravelDistance() {
        // Calculates and returns the distance traveled
    	
    	return 40.0;
    }
}




public class TaxiCab extends Car implements PublicTransport{
    public double calculateFare() {    // Implementing interface's method
        double billAmount = MIN_AMOUNT + (RATE * getTravelDistance());
        return billAmount;
    }
    public double getTravelDistance() {
        // Calculates and returns the distance traveled
    	
    	return 40.0;
    }
}

