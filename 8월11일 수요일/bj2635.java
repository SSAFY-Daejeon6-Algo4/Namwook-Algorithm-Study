package Algo_0811;

import java.util.*;
import java.io.*;

public class bj2635 {
	/** 백준 2635 수 이어가기 S5
	 * 도전!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 23:30
	 * 끝난시간 : 2:05 // 실패 !!!
	 * key point : 
	 * 애로사항 : 알고리즘 설계, LinkedList 연습, 크기가 미정이라면 링크드리스트를 쓰는것 같습니다. 
	 * 	 * */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> LL = new LinkedList<Integer>();
		LinkedList<Integer> LL2 = new LinkedList<Integer>();
		String s = br.readLine();
		int T = Integer.parseInt(s); //첫번째 수 
		int result=0; // 출력 길이
		int max=0; //길이 최대값 저장				
		
		for(int i=1; i<=T; ++i) {
			LL = new LinkedList<Integer>();
//			LL2 = new LinkedList<Integer>(); //-???
			LL.add(T);
			LL.add(i);
			int k=0;
			
			while(true) {					
				if(LL.get(k)-LL.get(k+1)>=0) {
					LL.add(LL.get(k)-LL.get(k+1));
					++k;					
				}				
				else {
					break;
				}				
			}//while			
			
			//가장 긴 길이와 그때의 원소값들을 LL2에 저장해준다. 
			//result = LL.size();
			if(max<=LL.size()) {
				max=LL.size();				
				for(int j=0; j<max; ++j){
					int e=0;
					e=LL.get(j);
					//System.out.print(e+" ");
					LL2.add(e);
				}				
			}
			
		}//for
		
		//위치를 어디이ㅔ?????????????
		System.out.println(max);
		for(int i=0; i<LL2.size(); i++) {
			System.out.print(LL2.get(i)+" ");//★★★★★★★★★★★??
		}
		System.out.println();
		
	}//main

}
