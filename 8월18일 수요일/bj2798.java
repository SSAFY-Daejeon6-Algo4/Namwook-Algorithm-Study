package Algo_0818;

import java.util.*;
import java.io.*;

public class bj2798 {
	/** bj 2798 블랙잭 B2
	 * 도전!!!!!!!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : 
	 * 의도 : 주어진 수들의 부분합을 계산하고, 그때마다 M와 비교해서 차이가 가장 작고, 
	 * 		M보다 작은 값을  result 저장한다. 
	 * */
	public static int  N,R,M;
	public static int[] input;
	//public static boolean[] isSelected;	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());//장수
		M = Integer.parseInt(st.nextToken());//블랙잭
		int min_result = Integer.MAX_VALUE;
		int result=0;
		int sum=0;
		input = new int[N];//입력한 숫자를 담을 배열
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<N; ++i) {
			input[i] = Integer.parseInt(st2.nextToken());
		}
		
		/** 조합으로 도전해보려햇는데 적용을 못하겠음. 그래서 for문 돌려서 모든 경우 계산하기 */
		for(int i=0; i<input.length-2; ++i) { //범위가 중요 >> 도움받았음.
			for(int j=i+1; j<input.length-1; ++j) {
				for(int k=j+1; k<input.length; ++k) {
					
					sum = input[i]+input[j]+input[k];//세 수의 합
					
					if(sum==M) {//같은 경우 그 수 바로 출력
						System.out.println(sum);
						return;
					}//if
					else if(sum<M) {//작으면서 제일 클때 ㅇㅇ
						if(sum>result) {
							result=sum;
						}
						
					}//else
					//큰경우는 그냥 계속 for문 돌겠지.				
				}//3
			}//2
		}//1
		System.out.println(result);
	}
}
