package heap;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MoreSpicy {

	public static void main(String[] args) {

		PriorityQueue<Integer> pque = new PriorityQueue<>(); // 우선순위 큐 생성

		Scanner sc = new Scanner(System.in);

		System.out.print("각 음식의 스코빌 지수를 입력해주세요(,로 구분)"); // ex) 1,2,3,4,5
		String element = sc.next();

		if (!element.isEmpty()) { // 비어있는지 확인

			String[] elementArray = element.split(","); // 콤마로 자르기

			for (int i = 0; i < elementArray.length; i++) {
				pque.add(Integer.parseInt(elementArray[i])); // 우선순위 큐에 입력한 요소들을 넣어준다.
			}

			System.out.println("-------------------------------------------------------");
			System.out.print("k를 입력해주세요(기준 스코빌 지수)");
			int k = sc.nextInt();
			System.out.println("-------------------------------------------------------");

			// <toArray>
			// - 배열을 가져올 수 있음.
			// - poll() 과 달리 요소를 지우지 않고, 리스트 처럼 그냥 순회만 할 경우 사용
			// - 정렬된 순서대로 순회되지 않음.
			// - 들어간 순서도 아님. [0] 에 poll() 할 요소만 와있는 상태.

			boolean tf = false; // 조건을 만족하면 true 대입

			int mixCnt = 0; // 섞은 횟수

			while (tf == false) {
				Object[] pqueArray = pque.toArray(); // 우선순위 큐 배열화, 모든 요소들을 꺼내기 위함
				int arrLength = pqueArray.length; // 큐의 사이즈

				// System.out.println("큐의 사이즈: " + arrLength);

				int nodeCnt = 0; // k이상인 노드의 수

				for (int i = 0; i < arrLength; i++) {
					if (Integer.parseInt(pqueArray[i].toString()) >= k) {
						++nodeCnt; // k이상이면 +1
						if (nodeCnt == arrLength) { // 모든 노드가 k이상이면
							tf = true; // 반복문을 멈춘다
							System.out.println("모든 음식의 스코빌지수가 k이상이라는 조건을 만족합니다.");
							System.out.println("섞은 횟수는 " + mixCnt + "입니다.");
							System.out.println("-------------------------------------------------------");
							break;
						}
					}
				}

				if (tf == false) {
					System.out.println("스코빌지수(k) -> " + k + " 이상인 음식 수 : " + nodeCnt);
					int element_1 = pque.poll();
					System.out.println("첫번째로 작은 스코빌지수: " + element_1);
					int element_2 = pque.poll();
					System.out.println("두번째로 작은 스코빌지수: " + element_2);

					int mixElement = element_1 + (element_2 * 2);
					System.out.println("섞은 스코빌 지수 -> " + element_1 + " + " + "(" + element_2 + " * 2) = " + mixElement);
					System.out.println("-------------------------------------------------------");
					pque.add(mixElement);

					// <Iterator>
					// - 리스트 처럼 그냥 순회만 할 경우 사용
					// - 정렬된 순서대로 순회되지 않음
					// - 들어간 순서도 아님
					// - [0] 에 poll() 할 요소만 와있는 상태.

					Iterator<Integer> afterIter = pque.iterator();

					int idx = 1;

					System.out.println("큐 노드들 확인!!");
					while (afterIter.hasNext()) {
						int i = afterIter.next();
						System.out.println(i);
						idx++;
					}

					mixCnt++;
				}
			}

			sc.close();

		}
	}

}