package concept;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a name:");
		String name= sc.next();
		System.out.println("Name :"+name);
		
		System.out.println("Enter a college:");
		String college= sc.next();
		System.out.println("College :"+ college);
		
		System.out.println("Enter a dept:");
		String dept= sc.next();
		System.out.println("Department :"+dept);
	}

}
