package heap;

public class Main {
	
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		MoreSpicy_answer e = new MoreSpicy_answer();
		System.out.println("섞은 횟수 : " + e.solution(scoville, K));
	}

}