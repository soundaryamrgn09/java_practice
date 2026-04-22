package exception;

public class Divide_by_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			int num=50/0;
			// int num=50/5;
			//throw new Exception("A number is not divisible by zero.");
		}catch(Exception e) {
			System.out.println(e);
			//System.out.println(e.getMessage());
		}
		finally {
            System.out.println("Successfull.");
	}

}
}
