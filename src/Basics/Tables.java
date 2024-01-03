package Basics;

import java.util.Iterator;
import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Which Table you want to print???");
		int input=sc.nextInt();
		int ans =input;
//		~~~~~~~~~~~~~~~~~~Using do while~~~~~~~~~~~~~~~~~~~~~~~~~~~
		int i=1;

		do {
			System.out.println(input+" * "+i+" = "+ans);
			i++; 
			ans =input*i;
		}while(i<=20);
	
		
//		~~~~~~~~~~~~~~~~~~Using for loop~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		for (int j = 1; j <=20; j++) {
			System.out.println(input+" * "+j+" = "+input*j);
			
		}
		
		
		
		sc.close();
	}

}
