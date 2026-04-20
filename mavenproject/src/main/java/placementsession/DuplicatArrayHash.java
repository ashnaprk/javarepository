package placementsession;

import java.util.HashSet;

public class DuplicatArrayHash {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 2, 4, 1 };

		HashSet<Integer> set = new HashSet<>();

		System.out.println("Duplicate elements:");

		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				System.out.println(arr[i]);
			} else {
				set.add(arr[i]);
			}
		}
	}
}
