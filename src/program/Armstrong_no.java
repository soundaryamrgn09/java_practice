package program;

import java.util.Scanner;

public class Armstrong_no {
	
	public String check_Armstrong(int n) {
		
		int num=n;
		int original= num;
		int sum=0;
		
		while(num>0) {
			
			int ld=num%10;
			sum=sum+(ld*ld*ld);
			num=num/10;
		}
		
		//Ternary operator
		String res=(original == sum) ? sum +" is a Armstrong no":sum +" is not a Armstrong no";
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		
		Armstrong_no arm=new Armstrong_no();
		String Result=arm.check_Armstrong(num);
		System.out.println(Result);
		
		sc.close();
	}

}
