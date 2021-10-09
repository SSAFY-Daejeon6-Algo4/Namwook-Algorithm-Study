package Algo_1009;


public class Seed {
	/**
	 * 프로그래머스 예상 대진표
	 */
	static int answer;
	static int A, B;


	public static int solution(int n, int a, int b) {
		answer = 0;
		A = a;
		B = b;
		
//		토너먼트의 특성을 이용한 처음 풀이 반례 [8,4,5]
//		while (Math.abs(A - B) != 1) {// 순번을 비교함>>둘의 인덱스가
//			++answer;
//			if (A % 2 == 0) {// 짝수면 + (-1)된 수와 경기를 치를테니깐
//				A = (A / 2);
//			} else {
//				A = (A + 1) / 2;
//			}
//
//			if (B % 2 == 0) {// 짝수면 + (-1)된 수와 경기를 치를테니깐
//				B = (B / 2);
//			} else {
//				B = (B + 1) / 2;
//			}
//		}
		
		//질문보다가  
		while(A!=B) { 
			++answer; 
			if(A%2!=0) {
				A=A+1;//1부터 시작이고, 홀수일 경우에는 +1해서 /2한 인덱스를 가지게 되므로(무조건 이기니까)
			}
			if(B%2!=0) {
				B=B+1;
			}
			A/=2;//둘이 만나면 +1차이 나므로 한쪽은 위에서 +1해서 들어올거고 그렇게 되면 나눴을때 같아질테니깐
			B/=2;
		}		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(8, 4, 7));
	}

}
