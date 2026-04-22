package exception;

public class Count_the_digit {

//	public int count(int num) {
	
	public static int count(int num) {
	    int count=0;
		int n =num;
	
		while(n>0) {
			
		    count+=1;
			n=n/10;
	    }
	      return count;
}
	
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Count_the_digit c=new Count_the_digit();
		//int result=c.count(1234);
		int result=count(1234);
		System.out.println(result);
	}

}
	
	
	
