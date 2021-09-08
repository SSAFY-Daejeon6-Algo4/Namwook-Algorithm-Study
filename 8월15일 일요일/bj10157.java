package Algo_0815;

import java.util.*;
import java.io.*;

public class bj10157 {
	/** 백준 10157 자리배정 S4
	 * 도전!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : 달팽이, 배열회전, 스도쿠, 오목 ★ ★ ★ ★ ★ ★
	 * 특이사항 : 배정된 좌석번호 출력, 만약 배정이 안될경우 0 출력
	 * 				코드를 이해하는데 중점을 두었습니다. 아직 완벽하게 이해는 못했습니다. 
	 * 
	 * */
	
	public static int x, y, dir;
	public static int dx[] = {-1,0,1,0};//상우하좌 순서????
	public static int dy[] = {0,1,0,-1};
	public static int map[][];
	public static int count = 1;
	
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());//격자크기 열, 행
		int R = Integer.parseInt(st.nextToken());		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st2.nextToken());//대기번호
		
		map=new int[R][C];//?데자뷴가
		x=R-1; //시작좌표
		y=0;
		dir=0;//방향 -> 연습 더 필요 .. 
		
		if(K>C*R) {//먼저 게임시작조건부터 따지고 시작.
			System.out.println(0);
			return;
		}
		
		while(count!=K) {//여기까진 ㅇㅋ 그다음이 헷갈리네
			//카운트를 세다가 해당 대기번호랑 일치할 시 그때 좌표 출력 후 종료
			map[x][y]=count;//<-왜 여기서 오류가 걸리지 
			
			int nx = x+dx[dir];
			int ny = y+dy[dir];//방향이랑 연산되는 과정 제대로 이해 필요 
			
			//새로운 좌표가 맵을 벗어나면 안됌. 
			if(nx<0 || ny<0 || nx>=R || ny>=C || map[nx][ny] != 0) {//여기에 좌표=가 왜 들어가지..?
				++dir;
				if(dir==4) {//방향 돌려서
					dir=0;
				}
				nx = x+dx[dir];
				ny = y+dy[dir];
			}			
			x=nx;
			y=ny;
			++count;
		}
		System.out.print((y+1)+" "+(R-x));//???
	}
}
