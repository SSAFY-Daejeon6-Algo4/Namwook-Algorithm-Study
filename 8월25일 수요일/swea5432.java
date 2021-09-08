package Algo_0825;

import java.io.*;
import java.util.*;

public class swea5432 {
	/**
	 * SWEA 5432 쇠막대기 자르기 D4
	 * 차근차근 자르면 크게 어려운 부분은 없음.
	 * */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=0; t<T; ++t) {
			int LaserCut=0;//레이저 개수
			int Ironstick=0;//입력으로 주어진 쇠막대기 개수
			int cnt=0;//잘린 쇠막대기 개수
			String str = br.readLine();//입력
			for(int i=0; i<str.length(); ++i) {
				if(str.charAt(i)=='(' && i<str.length()-1) {
					//쇠막대기, 레이저 구별 ( 시작 + index 범위 제한
					if(str.charAt(i+1)==')') {//레이저면 cut,이후 쇠막대기 있는지를 판단
//						str.replace(str.charAt(i), '#');
//						str.replace(str.charAt(i+1), '#');
						cnt+=Ironstick;					
					}
					//쇠막대기면
					else if(str.charAt(i+1)!=')') {
						Ironstick+=1;
					}					
				}
				if(str.charAt(i)==')') {//
					if(str.charAt(i-1)!='(') {
						cnt+=1;
						--Ironstick;
					}
				}
			}//i for	
			System.out.println("#"+(t+1)+" "+cnt);//뒤에 쇠막대기 개수
		}//t for
	}//main
}//class
