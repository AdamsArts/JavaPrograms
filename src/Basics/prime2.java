package Basics;

import java.util.Scanner;

public class prime2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("It is a prime number");
		} else
			System.err.println("It is not a prime");
		sc.close();
	}
}
