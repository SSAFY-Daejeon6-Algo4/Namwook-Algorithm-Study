package Algo_0822;

import java.util.*;
import java.io.*;

public class bj8320 {
	/** bj 8320 직사각형을 만드는 방법 B3
	 * 도전!!!!!!!!!
	 * 예상풀이시간 
	 * 시작시간 : 
	 * 끝난시간 : 3시간??
	 * key point : 처음 시도 2차원 배열 -> 메모리 초과
	 * 				다섯개 정도 써보다가, 인덱스의 공통점을 발견하고 트라이 -> 성공
	 * 의도 :     중복조합은 생각안해봄????
	 * */   
	 		
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());//정사각형의 개수 N 
		int cnt=0;
		for(int i=1; i<=N; ++i) {
			for(int j=1; j<=N; ++j) {//연산횟수를 줄일 수 있을 것같습니다. n대신에 i
				if(i*j<=N && i<=j) { //인덱스가 같거나 작으면서 + 주어지는 수보다 작아야함.
					++cnt;
				}
			}			
		}
		System.out.println(cnt);
		
		
		/** 2차원 배열 
		int[][] arrays = new int[N+1][N+1];		//2차원 배열 선언, 0으로 초기화, 인덱스 맞춰주는거 귀찮아서 N+1
		
		//2차원배열을 만드는 경우의 수로 봐도 되니깐.
		for(int i=1; i<=N; ++i) {//범위를 어떻게 선정해야할지 몰라서 둘다 N으로 했습니다.
			for(int j=1; j<=N; ++j) {
				if(i*j<=N) {
					if(arrays[i][j]==arrays[j][i] && i!=j) { //대칭관계면서 두항이 같지 않으면
						arrays[i][j]=1;
					}
					
				}
			}
		}//밖for
		
		for(int i=0; i<N+1; ++i){
			for(int j=0; j<N+1; ++j){
				cnt+=arrays[i][j];
			}
		}//밖for
		
		System.out.println(cnt);*/
	}//main
}//class
