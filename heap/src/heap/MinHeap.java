package heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinHeap {

	public static void main(String[] args) {

		PriorityQueue<Integer> pque = new PriorityQueue<>(); // �켱���� ť ����

		Scanner sc = new Scanner(System.in);

		System.out.print("��Ҹ� �Է����ּ���(,�� ����)"); // ex) 1,2,3,4,5
		String element = sc.next();

		String[] elementArray = element.split(","); // �޸��� �ڸ���

		for (int i = 0; i < elementArray.length; i++) {

			// System.out.print("�迭�� "+"["+i+"]"+"��° ���: ");
			// System.out.println(elementArray[i]);

			pque.add(Integer.parseInt(elementArray[i])); // �켱���� ť�� �Է��� ��ҵ��� �־��ش�.
		}

		System.out.println("#############################");
		System.out.println("<�ּ���-MinHeap>");
		System.out.println("---> root(�켱������ ���� ����)�� ���� ���� ���� ��ġ�Ѵ�.");

		int pqueSize = pque.size(); // �켱���� ť�� ������

		for (int i = 1; i <= pqueSize; i++) {
			System.out.print("[" + i + "]" + "��° �켱������ �ִ� ���: ");
			System.out.println(pque.peek()); // ���� �켱������ ���� ���� ��� ���
			pque.poll(); // ���� �켱������ ���� ���� ��� ����
		}
		System.out.println("#############################");

		sc.close();
	}
	

}
