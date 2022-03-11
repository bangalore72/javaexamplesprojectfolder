package dxc.basic2;

 
public class InterfaceTester {
    public static void main(String[] args) {
    	PublicTransport cab = new OlaCab();
        // After travelling
        System.out.println("Your bill amount is: Rs." + cab.calculateFare());
        
        /*
        cab = new OlaCab();
        // After travelling
        System.out.println("Your bill amount is: Rs." + cab.calculateFare());
        */
        
    }
}
