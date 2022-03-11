package dxc.basic2.exceptionexercise;


import java.io.*;

public class UserNotValidException extends Exception {
  

   private String message;
   
   public UserNotValidException(String message) {
      this.message = message;
   }
   
 
   public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}