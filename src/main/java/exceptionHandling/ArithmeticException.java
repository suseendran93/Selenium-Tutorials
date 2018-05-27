package exceptionHandling;

import java.util.Scanner;

public class ArithmeticException {

	public static void main(String[] args) {
		
		boolean flag=false;
		do {
		try {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first num:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd num:");
		int b=sc.nextInt();
		
		System.out.println("Ans: "+a/b);
		flag=true;
	}
		catch(Exception e){
			System.out.println("Can't divide a number by zero");
			
		}
		
	}
		
		while(flag==false);
	}
	
}
