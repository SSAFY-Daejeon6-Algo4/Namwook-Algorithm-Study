package Algo_0815;

import java.util.*;
import java.io.*;

public class bj2559 {
	/** 백준 2559 수열 S3
	 * 도전!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : int result = Integer.MIN_VALUE; 
	 * //result = 0으로 설정할 경우 음수가 나오는 경우에서 최소를 잡지 못한다. 
	 * MIN_VALUE로 문제 해결
	 * 특이사항 :  
	 * */
	
	public static void main(String[] args) throws Exception{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		//System.out.println(K);
		int[] deg = new int[N];
		int result = Integer.MIN_VALUE; //result = 0으로 설정할 경우 음수가 나오는 경우에서 오답 발생
		int tmp = 0;
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<N; ++i) {
			deg[i]=Integer.parseInt(st2.nextToken());
		}//for deg
		
		for(int i=0; i<deg.length; ++i) {
			tmp = 0;
			for(int j=i; j<i+K; ++j) {
				tmp += deg[j];
			}
			if(result<tmp) {
				result = tmp;
			}			
			if((i+K)==N) {
				break;
			}
		}//for i
		System.out.println(result);
	}

}
