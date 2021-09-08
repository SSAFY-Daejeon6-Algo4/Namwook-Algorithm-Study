package Algo_0825;

import java.util.*;
import java.io.*;

public class swea1940 {
	/**
	 * SWEA 1940 가랏!RC카 D2
	 * 문제 이해가 어려움 : 뭔소리야?
	 * V=V0+at
	 * 등속일때 이동하는 것 까먹으면 안됨.
	 * */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());//testCase	
		
		for(int t=0; t<T; ++t) {
			//초기화
			int distance = 0;//이동거리
			int v0 = 0;//초기속도
			int mode = 0;//가속모드
			int a=0;//가속도
			int v=0;
			
			//각 테케당 거리 계산 시작
			int N = Integer.parseInt(br.readLine());//Command
			//System.out.println(N);
			for(int i=0; i<N; ++i) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				mode = Integer.parseInt(st.nextToken());// 1,2...
				if(mode!=0) {//mode가 0일 경우 등속이므로 현속만큼 이동거리 더해줌.
					a = Integer.parseInt(st.nextToken());
					if(mode==1) {//가속
						v=v0+(a*1);
						//가속일 경우 최소속도가 0이기 때문에 속도가 음수가 될수없음.
						distance+=v*1;
						v0=v;
					}
					else if(mode==2) {//감속
						v=v0-(a*1);
						if(v<0) {
							v=0;
						}
						distance+=v*1;
						v0=v;
					}					
				}//mode!=0
				if(mode==0) {
					distance+=v0*1;	
				}				
			}//i for
			System.out.println("#"+(t+1)+" "+distance);
		}//tc for		
	}//main
}//class
