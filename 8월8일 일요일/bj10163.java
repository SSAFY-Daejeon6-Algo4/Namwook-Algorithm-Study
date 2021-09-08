package Algo_0808;

import java.util.*;
import java.io.*;

public class bj10163 {
	/** 백준 10163 색종이 B1
	 * 도전해야할 문제여서 + 풀 수 있을 것 같았습니다.
	 * 예상풀이시간 1시간
	 * 시작시간 : am 2:20
	 * 끝난시간 : am 3:30
	 * key point : 다른 색종이 문제랑 비슷하지만, 인덱스를 활용해서 사각형을 그리는 방식을 찾는 곳에서 많이 헤맸고, 
	 * 				+ 다 그리고 난후 면적을 계산하여 출력하는 방법에서 인덱스를 헷갈려서 많이 힘들었습니다. + 구글 도움받음.
	 * 애로사항 : 
	 * */
	public static void main(String[] args) throws Exception {
		int x=0;
		int y=0;
		int width=0;
		int height=0;
		int[][] maps = new int[1002][1002];
		int[] count = new int[101]; // 종이는 100이하니깐. 
		//항상 받아오는게 먼저니깐. 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		for(int i=1; i<=N; ++i) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			x=Integer.parseInt(st.nextToken());//순서대로  0 0 10 10 
			y=Integer.parseInt(st.nextToken());
			width=Integer.parseInt(st.nextToken());
			height=Integer.parseInt(st.nextToken());
			
			for(int j=x; j<x+width; ++j) {
				for(int k=y; k<y+height; ++k) {
					maps[j][k]=i; //전부다 0으로 초기화 되어있으니 이 부분을 인덱스랑 맞추려면 1부터 시작해야합니다.
					// 등호를 넣어주면 테스트케이스만큼 채워줄테니깐. ★★★
				}
			}
		}
		
		for(int i=0; i<1002; ++i) {// 0 1 2 3 4 ... 있는 배열에서 해당 수가 있는 만큼 카운팅
			for(int j=0; j<1002; j++) {
				count[maps[i][j]]++; // 이걸 만드는게 어려웠음. 
			}				
		}
		
		for(int i=1; i<=N; ++i) { //0항에 있는 것들은 출력할 필요가 없음. 
			System.out.println(count[i]);
		}

	}

}
