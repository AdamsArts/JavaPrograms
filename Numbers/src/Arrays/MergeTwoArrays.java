package Arrays;

import java.util.Iterator;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] first = { 1, 2, 3, 4, 5, 6 };
		int[] second = { 7, 8, 9, 10 };

		int[] MergedArray = new int[first.length + second.length];

//		for (int i = 0; i < first.length; i++) {
//
//			MergedArray[i] = first[i];
//
//		}
//
//		for (int i = 0; i < second.length; i++) {
//
//			MergedArray[first.length + i] = second[i];
//
//		}
//		for (int i = 0; i < MergedArray.length; i++) {
//			System.out.println(MergedArray[i]);
//		}
		int index=0;
		for (int i : first) {
			MergedArray[index++] = i;
			
		}
		for (int i : second) {
			MergedArray[index++] = i;
			
		}
		for (int i : MergedArray) {
			System.out.println(i);
			
		}


	}

}
