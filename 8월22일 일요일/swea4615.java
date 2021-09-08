package Algo_0822;

import java.util.*;
import java.io.*;

public class swea4615 {
	/** swea4615 재미있는 오셀로 게임 D3
	 * 도전!!!!!!!!!
	 * 예상풀이시간 
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : 구현??? 실제 배열과 주어지는 좌표 인덱스 따지는 법, 사방탐색 아직 미숙..ㅠ >>중점적으로 풀어볼것
	 * 의도 : 
	 * */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());//테스트 케이스 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int blackStone=0;
		int whiteStone=0;
		char stone='0';
		int N = Integer.parseInt(st.nextToken());//맵
		char[][] maps = new char[N][N];
		//초기 위치 설정 N=4,6,8 - N/2, N/2 - 1
		maps[N/2-1][N/2-1]='W';
		maps[N/2-1][N/2]='B';
		maps[N/2][N/2-1]='B';
		maps[N/2][N/2]='W';
		
		int M = Integer.parseInt(st.nextToken());//놓는 횟수
		for(int i=0; i<T; ++i) {//테스트 케이스 
			for(int j=0; j<M; ++j) {//순서대로 돌 놓기
				StringTokenizer st2 = new StringTokenizer(br.readLine());//들어오는 순서대로 돌을 위치시킬거임. B1 W2
				int x=Integer.parseInt(st2.nextToken());//1,1..좌표 저장
				int y=Integer.parseInt(st2.nextToken());//2,1..
				if(Integer.parseInt(st2.nextToken())==1) {//들어오는 수에 따라서 돌의 종류 저장
					stone = 'B';
				}
				else {//아니면 2니깐.
					stone = 'W';
				}
				maps[y-1][x-1] = stone; 				//돌이 들어오는 위치와 초기 조건, 한계를 이용해서 룰을 적용한다. 
				if(y-1>=0 && y-1<N && x-1>=0 && x-1<N) {	//사방탐색을 하면서 범위조건을 따져줘야한다. 
					//사방탐색해서 1칸이내에 다른 돌이 있고 + 그 보다 한칸 너머에 나랑 같은 돌이 있다면?
					if((y>2)
					//한칸이내에 있는 돌을 나와 같은 종류로 덮어 씌운다.
					
				}				
				//돌을 놓을 수 없는 곳은 입력으로 주어지지않으므로 판단하는 과정은 필요없다. 모든 입력은 유효하다.				
			}//for j를 다 돌고나면 테스트 케이스 하나가 종료된다. 모든 맵에 결과가 반영되어 있어야 한다.
			
			for(int j=0; j<N; ++j) {					//다 돌고나면 맵을 돌면서 백돌W 흑돌B의 개수를 센다. 
				for(int k=0; k<N; ++k) {
					if(maps[j][k]==1) {
						++blackStone;
					}
					else if(maps[j][k]==2) {
						++whiteStone;
					}//else는 0이겠지.
				}
			}			
			
			//흑돌, 백돌 순서대로 출력
			System.out.print("#"+(i+1)+" "+blackStone+" "+whiteStone);			
		}//for testcase	
	}//main
}//class
