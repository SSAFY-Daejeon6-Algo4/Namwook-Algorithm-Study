package Algo_0818;

import java.util.*;
import java.io.*;

public class swea2805 {
	/** SWEA 2805 농작물 수확하기
	 * 도전!!!!!!!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : 
	 * 의도 : 
	 * */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());//테케 수 1		
		for(int i=0; i<T; ++i) {
			int N = Integer.parseInt(br.readLine());//농장크기 5
			int[][] farm = new int[N][N];//농장배열선언
			for(int j=0; j<N; ++j) {//농장에 가치 집어넣기
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int k=0; k<N; ++k) {
					farm[j][k]=Integer.parseInt(st.nextToken());
				}
			}//농장 완성
			
			
		}//for

	}//main
}//class
