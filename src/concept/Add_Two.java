package concept;

import java.util.Scanner;

public class Add_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a : ");
		int a= sc.nextInt();
		System.out.println("Enter b : ");
		int b= sc.nextInt();
		
		int c= a+b;
		System.out.println("Addition of two number : "+ c);
		
		int sub= a-b;
		System.out.println("Subtraction of two number : "+ sub);
		
		int Mul= a*b;
		System.out.println("Multiplication of two number : "+ Mul);
		
		int div= a / b;
		System.out.println("Division of two number : "+ div);
		
		int rem=a % b;
		System.out.println("Remainder of two number : "+ rem);
        
		sc.close();
	}

}
