package Arrays;

public class MergingTwoStringArrays {
	public static void main(String[] args) {
		String[] first = { "Adam", "Simran", "Tamizh" };
		String[] second = { "Sudha", "NoodlesManda" };
		int size = first.length + second.length;
		String[] MergerArray = new String[size];

		for (int i = 0; i < first.length; i++) {

			MergerArray[i] = first[i];

		}
		for (int i = 0; i < second.length; i++) {

			MergerArray[first.length + i] = second[i];

		}
		
		for (int i = 0; i < MergerArray.length; i++) {
		System.out.println(MergerArray[i]);	
		}

	}

}
