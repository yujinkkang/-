package heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinHeap {

	public static void main(String[] args) {

		PriorityQueue<Integer> pque = new PriorityQueue<>(); // 우선순위 큐 생성

		Scanner sc = new Scanner(System.in);

		System.out.print("요소를 입력해주세요(,로 구분)"); // ex) 1,2,3,4,5
		String element = sc.next();

		String[] elementArray = element.split(","); // 콤마로 자르기

		for (int i = 0; i < elementArray.length; i++) {

			// System.out.print("배열의 "+"["+i+"]"+"번째 요소: ");
			// System.out.println(elementArray[i]);

			pque.add(Integer.parseInt(elementArray[i])); // 우선순위 큐에 입력한 요소들을 넣어준다.
		}

		System.out.println("#############################");
		System.out.println("<최소힙-MinHeap>");
		System.out.println("---> root(우선순위가 가장 높음)에 가장 작은 값이 위치한다.");

		int pqueSize = pque.size(); // 우선순위 큐의 사이즈

		for (int i = 1; i <= pqueSize; i++) {
			System.out.print("[" + i + "]" + "번째 우선순위에 있는 노드: ");
			System.out.println(pque.peek()); // 현재 우선순위가 가장 높은 노드 출력
			pque.poll(); // 현재 우선순위가 가장 높은 노드 삭제
		}
		System.out.println("#############################");

		sc.close();
	}
	

}
