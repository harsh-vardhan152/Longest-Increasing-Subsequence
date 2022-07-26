package subsequence;

import java.util.*;

public class LongestIncreasingSubsequence {

	public static void main(String args[]) {
		int arr2[] = { 12, 4, 20, 1, 24, 15, 34, 50, 7, 97 };
		int arrLenght = arr2.length;
		System.out.println("The Lenghth of required Increasing Sequence is  =  " + inSub(arr2, arrLenght));
	}

	public static ArrayList<ArrayList<Integer>> s = new ArrayList<>();
	public static ArrayList<Integer> q = new ArrayList<>();

	public static int inSub(int arr2[], int arrLenght) {
		int arr1[] = new int[arrLenght];
		int i, j, maximum = 0;
		for (i = 0; i < arrLenght; i++) {
			arr1[i] = 1;
		}
		for (i = 1; i < arrLenght; i++) {

			for (j = 0; j < i; j++) {

				if (arr2[i] > arr2[j] && arr1[i] < arr1[j] + 1) {
					arr1[i] = arr1[j] + 1;

				}
			}
		}
		for (i = 0; i < arrLenght; i++) {

			if (maximum < arr1[i]) {
				q.add(arr2[i]);
				maximum = arr1[i];
			}
			s.add(new ArrayList<>(q));
		}
		System.out.println("Sequence = " + s.get(s.size() - 1));
		return maximum;
	}

}
