package program;

import java.util.Scanner;

public class Palindrome {

//   public static boolean isPalindrome(int n)
   public String check_Palindrome(int n) {
		
		int num=n;
		int original=num;
		int rev=0;
		
		while(num>0) {
			int last_digit=num%10;
			rev=rev*10+last_digit;
			num=num/10;
			}
//		return original ==rev;
		
		
		if(original == rev) {
		    return(original +" is a palindrome");
	   }
	   else {
		   return(original +"is not a palindrome");
	   }
   }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int Num=sc.nextInt();
		
		Palindrome pa=new  Palindrome();
    	String res=pa.check_Palindrome(Num);
//		check_Palindrome(Num);
//		 System.out.println("Palindrome of a "+ Num +" "+ "is :"+ res);
    	System.out.println(res);

		 sc.close();
	}
	 

	}


