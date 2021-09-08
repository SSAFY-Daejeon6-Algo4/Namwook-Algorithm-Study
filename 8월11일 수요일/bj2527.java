package Algo_0811;

import java.util.*;
import java.io.*;

public class bj2527 {
	/** 백준 2527 직사각형 S1
	 * 도전!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 2:56
	 * 끝난시간 : 4:00
	 * key point : 
	 * 애로사항 :  
	 * 	 * */
	public static void main(String[] args) throws Exception {
		/**
		 * 직사각형 a 선분 b 점 c 공통x d
		 * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//4줄씩 8개의 token
		for(int i=0; i<4; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			
			int x3=Integer.parseInt(st.nextToken());
			int y3=Integer.parseInt(st.nextToken());
			int x4=Integer.parseInt(st.nextToken());
			int y4=Integer.parseInt(st.nextToken());
			
			if((x1==x4)&&(y1==y4) || (x2==x3)&&(y1==y4) || (x2==x3)&&(y2==y3) || (x1==x4)&&(y2==y3)) {
				//점이 같을때는 네꼭지점에서 만나는 경우 말곤 없다.  
				System.out.println("c");
			}
			else if(y4<y1 || y2<y3 || x4<x1 || x2<x3) {
				//겹치지않으면+선분으로 만날때 걱정하는 경우의 수는 여기에 걸린다. 
				System.out.println("d");
			}
			else if((x2==x3)&&(y2!=y3) || (x1==x4)&&(y2!=y3) || (x2!=x3)&&(y2==y3) || (x2!=x3)&&(y1==y4)) {
				//선분으로 만나거나
				System.out.println("b");
			}
		
			else {
				//그 이외엔 직사각형
				System.out.println("a");
			}
		
		}

	}

}
