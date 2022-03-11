package com.infy.batch2022.abhishekmalhotra;

public  class Address {
	
	private String doorNo;
	private String street;
		
	public Address() {
	 
	}
	
	public Address(String doorNo, String street) {
		this.doorNo = doorNo;
		this.street = street;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	/*
    @Override
	public boolean equals(Object address) {
		Address otherAddress=(Address) address;
		 
		if(this.doorNo.equals(otherAddress.doorNo) && this.street.equals(otherAddress.street))
			return true;
		return false;
	} */
   
    

    @Override
	public boolean equals(Object object) {
		
    	
    	if (this == object) {    
	          return true;    
	     }    
    	 
    	if(object instanceof Address)
    	{
    		Address otherAddress = (Address)object;
    		
    		if( (this.doorNo != null && otherAddress.doorNo != null)
    			&& (this.doorNo.equals(otherAddress.doorNo)) == false)
    		 
    		{
    			return false;
    		}
    		
    	}
     
		return false;
	} 
    
    
    @Override
	public int hashCode() {
		return 1+doorNo.hashCode()+street.hashCode();
	}

 

 

	public static void main(String[] args) {
		Address addressOne = new Address("11","Oxford Street");
		Address addressTwo=new Address("11","Oxford Street");
		
		
		Address addressThree=new Address(null ,null);
		
		
		
		//The equality of two objects are being checked using equals() method
		if (addressOne.equals(addressTwo)) {
			System.out.println("The address objects are same!");
		} else {
			System.out.println("The address objects are different!");
		}
		
		/*
		    Compare the following input with the addressOne and see the result
		    Address addressTwo=new Address("11","Hillview Street");
		*/
		
		
	}
}




