package sort;

import java.util.Arrays;
import java.util.Collections;

public class BiggestNumber_1 {

	public static void main(String[] args) {

		int[] numbers = { 3, 30, 34, 5, 9 };

		StringBuffer sb = new StringBuffer();

		for (int e : numbers) {
			sb.append(e + "");
		}

		System.out.println("sb: " + sb);

		Integer[] newNumbers = new Integer[sb.length()];

		System.out.println("Integer 배열의 길이: " + sb.length());

		for (int i = 0; i < sb.length(); i++) {
			newNumbers[i] = Integer.parseInt(sb.substring(i, i + 1));
			System.out.println(newNumbers[i]);
		}

		Arrays.sort(newNumbers, Collections.reverseOrder());

		System.out.println("sort 된 배열: " + Arrays.toString(newNumbers));

		StringBuffer answer = new StringBuffer();

		for (Integer n : newNumbers) {
			answer.append(n.toString());
		}

		System.out.println("답: " + answer);
	}

}
