package Algo_0829;

import java.util.*;
import java.io.*;

public class swea6958 {
	/** swea 6958 동철이의 프로그래밍 대회 D3

	 *  */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());//테스트 케이스 >> trim 양옆빈칸 전부 제거
		for(int t=1; t<=T; ++t) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());//인원 수
			int M = Integer.parseInt(st.nextToken());//문제 수 
			int max1 = 0;//1등한 인원수, 1로 초기화하면 안되는게, 어차피 밑에서 초기화시켜줄거임>>주의
			int max_solve = 0;//제일 많이 풀은 문제 
			int tmp=0;//비교할 임시 변수
			int[][] solved = new int[N][M];//n*m크기의 배열 선언 for 풀이입력
			
			for(int i=0; i<N; ++i) {//배열에 입력된 풀이 현황을 넣는다. 
				StringTokenizer st2 = new StringTokenizer(br.readLine());//10010
				for(int j=0; j<M; ++j) {
					solved[i][j]=Integer.parseInt(st2.nextToken());
				}
			}
			
			for(int i=0; i<N; ++i) {//배열-행을 돌면서 최고로 문제를 많이 풀은 인원, 그때 문제 수를 비교한다.
				tmp=0;//문제를 푼 수는 행마다 초기화>>주의
				for(int j=0; j<M; ++j) {//한행에 대한 열을 돌면서 solved를 체크
					if(solved[i][j]==1) {
						++tmp;
					}
				}
				//만약 최고문제풀이수보다 임시로 더한값이 크다면, 그 값을 저장한다.
				if(max_solve<tmp) {//만일 기존최대풀이보다 신규최대풀이가 더 많다면 새롭게 한명
					max1=1;
					max_solve=tmp;
				}
				else if(max_solve==tmp) {
					//기존=신규라면 한명 추가해줘야하니깐.
					++max1;
					max_solve=tmp;//헷갈리지만 같으니깐 한번 더 저장.
				}//기존>신규인경우는 그냥 넘어가도 무방.				
			}
			System.out.println("#"+t+" "+max1+" "+max_solve);
		}//TestCase for 
		br.close();
	}//main
}//class
