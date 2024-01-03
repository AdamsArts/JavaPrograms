package Basics;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		boolean result = findPrime(input);
		if(result)
			System.out.println(input+" is prime number");
		else
		System.err.println(input+" is not a prime number");

//		sc.close();

	}

	private static boolean findPrime(int input) {
		if(input==1||input==2)
			return true;
		
		for (int i = 2; i <=input / 2; i++) {
			
			if(input%i==0) {
				return false;	
			}
		}

		return true;
	}

}
