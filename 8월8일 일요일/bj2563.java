package Algo_0808;

import java.util.*;
import java.io.*;

public class bj2563 {
	/** 백준 2563 색종이 S5
	 * 도전해야할 문제여서 + 풀 수 있을 것 같았습니다.
	 * 예상풀이시간 1시간
	 * 시작시간 : am 3:40
	 * 끝난시간 : am 3:52
	 * key point : 색종이 관련 두문제를 풀고왔더니 이번 문제는 수월했습니다. 
	 * 애로사항 : 또종이?!
	 * */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); //색종이의 수 
		int result=0;
		int[][] maps = new int[100][100];
		
		for(int i=0; i<T; ++i) {
			int x=0;
			int y=0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());//쓰던안쓰던 쓰고 시작하자.
			x=Integer.parseInt(st.nextToken());
			y=Integer.parseInt(st.nextToken());
			
			for(int j=x; j<x+10; ++j) { //가로10세로10 정사각형만큼 채워야하므로
				for(int k=y; k<y+10; ++k) {
					maps[j][k]=1;
				}
			}//맵돌면서 1채우기. 겹치더라도 1채우기니깐 동일할 것. 			
		}//테케for
		
		//다돌고나서 전체합을 나타내는거니깐
		for(int i=0; i<100; ++i) {
			for(int j=0; j<100; ++j) {
				result+=maps[i][j];
			}
		}
		
		System.out.println(result);		 
		
	}

}
