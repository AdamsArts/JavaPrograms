package Patterns;

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for (int i = n; i >=1; i--) {
			
			for (int j = 1; j <=n-i;j++) {
				System.out.print("  ");
				
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		

	}

}
