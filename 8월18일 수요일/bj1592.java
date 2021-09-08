package Algo_0818;

import java.util.*;
import java.io.*;

public class bj1592 {
	/** bj 1592 영식이와 친구들 B2
	 * 도전!!!!!!!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : 배열 인덱스 컨트롤, 보충수업에서 다룬 문제인데 다시 해보려니 안풀려서 복습했습니다.
	 * 의도 : 
	 * */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		/**원이지만 결국 1차원 배열으로 표현이 가능하다. 
		 * 1차원 배열에 공을 받은 횟수를 기록하고, 
		 * 그 횟수가 M이 되면 종료합니다. 공을 던지는 기준은 짝/홀수 
		 * */
		int cnt = 0;//인원별로 공을 받는 횟수 -> 종료조건
		int[] circle = new int[N];		
		int toss=0;//공이 던져지는 총 횟수
		
		while(true) {
			circle[cnt]+=1;//1~N이니깐 0번 인덱스가 1번임. 받는 순간부터 시작이니깐 +1
			if(circle[cnt]==M) {
				break;
			}//종료조건 설정
			if(circle[cnt]%2==0) {//받은 횟수가 짝수면 반시계방향으로 L번째(음수)   
				cnt=(cnt-L+N)%N;//->이해 부족, 
			}
			else {//받은 횟수가 홀수면 시계방향으로 L번째(양수) 
				cnt=(cnt+L+N)%N;//N굳이 더해주지 않아도 된다!
			}		
			//
			++toss;
		}//while
		
		//종료조건이 되서 while문을 나오면 그동안 던져진 공의 횟수 출력하기 
		System.out.println(toss);
	}//main
}//class
