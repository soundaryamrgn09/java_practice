package exception;

import java.util.Scanner;

public class Reverse_number {

	public int Reverse(int n) {
		
		int num=n;
		int rev=0;
		
		while(num>0) {
			int last_digit=num%10;
			rev=rev*10+last_digit;
			num=num/10;
			}
		return rev;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int Num=sc.nextInt();
		
		 Reverse_number rv=new  Reverse_number();
		 int res=rv.Reverse(Num);
		 System.out.println("Reverse of "+ Num + "is :"+ res);

		 sc.close();
	}
	

}
