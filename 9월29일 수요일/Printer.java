package Algo_0929;

import java.util.*;
import java.io.*;

public class Printer {
	/**
	 * 프린터 중요도는 원소크기로 판단 그냥 돌기만 하면 되는듯??
	 */
	static int answer;
	static boolean flag;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine().trim());
		// int T = Integer.parseInt(st.nextToken());
		int[] priorities = { 1, 1, 9, 1, 1, 1 };// {2,1,3,2};
		int location = 0;// 2;
		System.out.println(solution(priorities, location));
	}

	public static int solution(int[] priorities, int location) {// location은 인덱스 의미
		answer = 0;// 인쇄되는 순서
		flag = false;
		int tmp = 0;
		Queue<Integer> queue = new LinkedList<Integer>();// 대기목록 선언

		for (int i = 0; i < priorities.length; ++i) {
			queue.add(priorities[i]);
		} // 큐에 입력받은 배열 원소 삽입

		// 큐 맨앞의 원소 뽑아서 인덱스 검사 & 크기 비교
		while (!queue.isEmpty()) {
			flag = false;
			tmp = queue.poll();// 큐의 맨 앞의 원소 추출 : 조건을 거치고나면 이쪽으로 돌아와야한다. >> 불필요한 연산?

			for (int i = 0; i < queue.size(); ++i) {
				if (tmp < (int) queue.toArray()[i]) {
					flag = true;
					break;
				}
			} // 원소보다 큰 경우가 있는지를 체크

			if (flag) {// poll()보다 큰 원소가 있는 경우 출력 x다(flag=true)
				queue.add(tmp);
				if (location == 0) {
					location = queue.size() - 1;
				} else {
					--location;
				}

			} else {// flag=false라면 poll()이 제일 크거나 같은게 있다는 의미니깐 location만 비교하고 출력o
				if (location == 0) {
					++answer;
					return answer;
				} else {// location이 0이 아닌 경우 즉 내가 찾는 수가 아닌 경우
						// 앞에서 제일 큰 수 출력되고 location--
					++answer;
					--location;
				}
			}
		} // while
		return answer;
	}//main
}//class
