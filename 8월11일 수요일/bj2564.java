package Algo_0811;

import java.util.*;
import java.io.*;

public class bj2564 {
	/** 백준 2564 경비원 S1
	 * 도전!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : 
	 * 애로사항 :  
	 * 	 * */
	public static void main(String[] args) throws Exception{
		int way1 = 0;//각 최단거리 비교하기 위해 만든 변수
		int way2 = 0;
		int shorts_sum = 0;	//최단거리 저장해서 출력할 것 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int block_x=Integer.parseInt(st.nextToken()); //블록의 가로, 세로 길이
		int block_y=Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(br.readLine()); //상점의 개수 
		LinkedList<Integer> way0 = new LinkedList<Integer>(); //들어오는 변수가 가변적이니깐 좌표를 저장하기 위해서
		for(int i=0; i<T; ++i) {
			//way0.add
			//리스트에 받아오는 좌표를 하나씩 저장. 꺼낼때마다 xy, xy, 이런식일거임. 
		}
		
		StringTokenizer st3 = new StringTokenizer(br.readLine());//동근이의 위치 
		int dongx = Integer.parseInt(st3.nextToken());
		int dongy = Integer.parseInt(st3.nextToken());
		
		//상점위치, 동근위치는 꼭지점이 될 수 없다. 
		
		//
		
		
		//접근 방법을 참고해서 
		//좌표 
	}

}
