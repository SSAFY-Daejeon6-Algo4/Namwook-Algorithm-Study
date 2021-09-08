package Algo_0811;

import java.util.*;
import java.io.*;

public class bj2477 {
	/** 백준 2477 참외밭 S5
	 * 도전!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : Fail, 풀이 이해x , 새로운 풀이 복습:넓이 여러번 계산 +++ 반시계에 집중?!!
	 * 애로사항 :  
	 * 	 * */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine()); // 1m^2당 참외의 개수
		//System.out.println(K);
		int w_max=0;//큰 직사각형 넓이용
		int h_max=0;
		int smw_max=0; //작은 직사각형 넓이용
		int smh_max=0;	
		int bg=0;
		int sm=0;
		int[] arr = new int[6];
		
		//변의 방향에서 동쪽은 1, 서쪽은 2, 남쪽은 3, 북쪽은 4로 나타낸다.. 
		for(int i=0; i<6; ++i) {//육각형이니깐 여섯번 + 두개씩 받아야하므로 총 12?
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		// 전체 사각형에서 굽어지는 부분 계산해서 빼기???
		// 일단 전체사각형은 들어오는 가로길이 중 최대, 들어오는 세로길이 중 최대 구해서 계산하기
		for(int i=0; i<6; ++i) {
			if(i%2==0) {
				if(w_max<arr[i]) {
					w_max=arr[i];
				}
			}
			else {
				if(h_max<arr[i]) {
					h_max=arr[i];
				}
			}		
		}//i<6 for
		
		for(int i=0; i<6; ++i) {
			if(i%2==0) {
				if(h_max == arr[(i+5)%6]+arr[(i+1)%6]) {//???????????
					//입력순서 상관x + 51 40    
//										          ㅣ ㅡ          ㅣ
//										          	  ㅣ    ㅣ  
					//인덱스벗어나지않게 
					smw_max=arr[i];
				}
			}
			else {
				if(w_max == arr[(i+5)%6]+arr[(i+1)%6]) {
					smh_max=arr[i];
				}
			}		
		}//i<6 for
		
		//System.out.println(0%2); //0이네??
		bg = (h_max*w_max);
		sm = (smw_max*smh_max);
		System.out.println((bg-sm)*K);
		
	}
}

