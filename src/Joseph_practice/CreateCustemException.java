package Joseph_practice;

public class CreateCustemException extends Exception {
		   String message;
		   CreateCustemException(String str) {
		      message = str;
		   }
		   public String toString() {
		      return ("Custom Exception Occurred : " + message);
		   }
		   public static void main(String args[]) {
			      try {
			         throw new CreateCustemException("This is a custom message");
			      } catch(CreateCustemException e) {
			         System.out.println(e);
			      }
			   }
		}
		
		  
		


