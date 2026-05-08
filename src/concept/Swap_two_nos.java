package concept;

import java.util.Scanner;

public class Swap_two_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a : ");
		int a=sc.nextInt();
		
		System.out.println("Enter b : ");
		int b=sc.nextInt();
		
		System.out.println("Before Swapping of two numbers : "+ a +" "+ b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping of two numbers : "+ a +" "+ b);
		sc.close();
	}
	

}
