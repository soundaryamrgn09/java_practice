package concept;

import java.util.Scanner;

public class Square_Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		
		int square=(int) Math.pow(n,2);
 	    System.out.println("Square Number : "+square);
		
 	    System.out.println();
 	    
		int cube=(int) Math.pow(n, 3);
		System.out.println("Cube no : " + cube);

//		int square=n*n;
//		System.out.println(square);
     
//		int cube=n*n*n;
//		System.out.println(cube);
//		
		sc.close();
	}

}
