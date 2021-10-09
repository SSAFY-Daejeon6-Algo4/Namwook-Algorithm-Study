package Algo_1006;

import java.util.*;
import java.io.*;

public class Shortest_game_map {
	/**
	 * 프로그래머스 게임 맵 최단 거리 bfs, dfs 둘다 연습해보고 차이를 확실히 느낄 것
	 * 
	 * 입력을 받아서 n과 m을 알아서 산출해야함
	 */
	
	static int n, m;
	static int[][] maps;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static boolean[][] visited;
	
	static class Point{ //2차원 배열 안에서 움직이는 좌표 계산할때 클래스를 선언해주는 것이 편합니다. 
		int x;
		int y;
		int answer;
		
		public Point(int x, int y, int answer) {
			super();
			this.x = x;
			this.y = y;
			this.answer = answer;
		}
	}
	
	public static void initVisited() {//초기화
		for(int i=0; i<visited.length; ++i) {
			for(int j=0; j<visited[i].length; ++j) {
				visited[i][j]=false;
			}
		}
	}
	
	public static int bfs(int start_x, int start_y, int[][] maps) {
		//큐 활용
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(start_x, start_y, 1));//큐에 넣고
		visited[start_x][start_y]=true;//해당위치 방문배열 초기화
		
		while(!queue.isEmpty()) {//큐가 빌때까지 반복하면서
			Point tmp = queue.poll();
			
			//다음 위치 들어가기 전 현재 위치가 목적지 인지 한번 확인 : 인덱스는 0부터 시작하니깐
			if(tmp.x==(n-1) && tmp.y==(m-1)) {//목적지에 도착했으면 그때 횟수 가지고 break
				return tmp.answer;
			}
			
			//다음 위치로 이동하기 위한 계산 : 범위를 벗어나면 안되고, 0이면 이동할 수 없음
			for(int i=0; i<4; ++i) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				if(nx>=0 && ny>=0 && nx<n && ny<m) {
					if(maps[nx][ny]==1 && !visited[nx][ny]) {//방문가능한 지점이고 내가 방문한 적이 없다면
						visited[nx][ny]=true;
						queue.offer(new Point(nx, ny, 1+tmp.answer));
					}				
				}
			}			
		}
		//다 돌고 나왓는데 
		return -1;
	}
	
	public static void dfs(int start_x, int start_y, boolean[][] visited, int[][] maps) {
		//스택, 재귀 활용
		initVisited();		
	}

	public static int solution(int[][] maps) {
		//자체적으로 maps를 넘겨받은 다음에, n과 m을 측정해서 부여하여 지표를 만들어준다.
		//넘겨받아서 만들언 maps크기만큼 visited를 선언해준다. 
		//포인트 클래스를 만드는 방법도 있지만 시작좌표를 넘겨줘본다.
		n = maps.length;
		m = maps[0].length;
		visited = new boolean[n][m];
		initVisited();//초기화
		return bfs(0,0,maps);		
	}

	public static void main(String[] args) throws IOException {
		maps = new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		//maps = new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
		System.out.println(solution(maps));
	}

}
