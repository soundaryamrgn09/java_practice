package concept;

import java.util.Scanner;


class InvalidLoginException extends Exception{
	public InvalidLoginException(String message) {
		super(message);
	}
}

class Exception_check{
	
	Scanner sc= new Scanner(System.in);
	
	public void Login_validation(){
		System.out.println("Enter a correctUsername:");
		String correctUsername=sc.nextLine();
		
		System.out.println("Enter a correctPassword:");
		String correctPassword=sc.nextLine();
		
		System.out.println("Enter a username:");
		String username=sc.nextLine();
		
		System.out.println("Enter a password:");
		String password=sc.nextLine();
		try {
	
		     if(!username.equals(correctUsername)|| !password.equals(correctPassword)) {
			     throw new InvalidLoginException("Login Falied!");
		     }
		     System.out.println("Login Successful");
	    }catch(Exception e) {
	    	System.out.println("Error:" + e.getMessage());
	    }
		
    }
}



public class Exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception_check ex=new Exception_check();
		ex.Login_validation();

	}

}



