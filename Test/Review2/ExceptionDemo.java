package Review2;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String args[]) throws OwnException{
		try {
			Scanner scan=new Scanner(System.in);
			int a=scan.nextInt();  //input mismatch unchecked exception
	
			Class.forName("mouli"); //checked Exception
		
		}
		catch(Exception e) {
//		    e.printStackTrace();
		   System.out.println(e.getMessage());
		 
//			throw new OwnException("im busy now you can handle it later"); //custom Exception
			
		}
		finally {
		System.out.println("hello");
		}
		
		
	}
	}


// https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.javatpoint.com%2Fexception-vs-error-in-java&psig=AOvVaw3Zg5doiCceGXID2fY4A2hL&ust=1678163429975000&source=images&cd=vfe&ved=0CA8QjRxqFwoTCPDHzpu8xv0CFQAAAAAdAAAAABAE
//extends the Exception class and RunTime Exception class
//by using the super keyword to initialize the value of parent class Exception

//
//  throwable
//  -Exception
//  -Error

//The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.
  


