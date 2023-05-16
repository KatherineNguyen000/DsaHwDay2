package dsHwDay2;

import java.util.ArrayList;
import java.util.List;

public class TallestCandles {

	public static void main(String[] args) {
		List<Integer> candles = new ArrayList<Integer>();
		candles.add(4);
		candles.add(4);
		candles.add(1);
		candles.add(3);
		int tallestCandles = candles(candles);
		System.out.println("The number of candles that are tallest : " + tallestCandles);
	}

	public static int candles(List<Integer> candles) {
		int n = candles.size();
		int max = candles.get(0);
		int count = 1;

		for (int i = 1; i < n; i++) {
			int height = candles.get(i);
			if (height > max) {
				max = height;
				count = 1;
			} else if (height == max) {
				count++;
			}
		}
		return count;
	}
}