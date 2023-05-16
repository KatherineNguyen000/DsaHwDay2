package dsHwDay2;

import java.util.ArrayList;
import java.util.HashMap;

public class OddTimes {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 2, 3, 4, 5, 5, 7, 7, 7 };
		ArrayList<Integer> result = findOddTimes(arr);
		System.out.println(result);
	}

	public static ArrayList<Integer> findOddTimes(int[] arr) {
		HashMap<Integer, Integer> frequency = new HashMap<>();
		ArrayList<Integer> oddTimesAppearNum = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (frequency.containsKey(arr[i])) {
				int freq = frequency.get(arr[i]);
				frequency.put(arr[i], freq + 1);
			} else {
				frequency.put(arr[i], 1);
			}
		}

		for (int key : frequency.keySet()) {
			int freq = frequency.get(key);
			if (freq % 2 == 1) {
				oddTimesAppearNum.add(key);
			}
		}
		return oddTimesAppearNum;
	}
}
