package heap;

import java.util.PriorityQueue;

public class MoreSpicy_answer {

	public int solution(int[] scoville, int K) {
		int answer = 0;

		PriorityQueue<Integer> pque = new PriorityQueue<>();

		for (int i = 0; i < scoville.length; i++) {
			pque.add(scoville[i]);
		}

		while (pque.peek() <= K) {

			if (pque.size() == 1) {
				return -1;
			}

			int element_1 = pque.poll();
			int element_2 = pque.poll();

			int mixElement = element_1 + (element_2 * 2);
			pque.add(mixElement);
			answer++;
		}

		return answer;

	}

}
