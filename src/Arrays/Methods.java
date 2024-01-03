package Arrays;

import java.util.Scanner;

public class Methods {
	Scanner sc = new Scanner(System.in);

	public int[] getArray() {

		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] a = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}

		sc.close();

		return a;
	}

	public void printArray(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		
	}

}
