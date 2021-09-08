package Algo_0808;

import java.util.*;
public class bj2669 { //Main으로 바꿔서 제출하기
	/** 백준 2669 직사각형 네개의 합집합의 면적 구하기 B1
	 * 도전해야할 문제여서 + 풀 수 있을 것 같았습니다2.
	 * 예상풀이시간 1시간
	 * 시작시간 : am 10:32
	 * 끝난시간 : am 11:12
	 * key point : 교집합을 구해서 빼는 것 보다 교집합을 체크할 필요 없이 알고리즘을 짜는 것이 중요.
	 * 애로사항 : 알고리즘적 생각 + 총면적을 구하는건지 겹치는 면적을 구하는건지 이해를 바로 못함. 
	 * */
	public static void main(String[] args) {
		//1. 입력받기
		//2. 일단 입력받은 4개의 직사각형 면적 각각 구하기 
		//3. 면적을 다 더해서 저장한다. 
		Scanner sc = new Scanner(System.in);
		int lowx=0;
		int lowy=0;
		int highx=0;
		int highy=0;
		int[][] s = new int[101][101]; //모든 x좌표와 y좌표는 1이상이고 100이하인 정수이다.
		
		for(int test_case=0; test_case<4; test_case++) {//4줄
			lowx=sc.nextInt();
			lowy=sc.nextInt();
			highx=sc.nextInt();
			highy=sc.nextInt();		
			
			//s=(highx-lowx)*(highy-lowy); // 사각형 면적 구하기
			for(int i=lowx; i<highx; i++) {
				for(int j=lowy; j<highy; j++) {
					s[i][j]=1;
				}
			}
		}
		int count=0;
		for(int i=0; i<101; i++) {
			for(int j=0; j<101; j++) {
				if(s[i][j]==1) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		sc.close();
	}

}
