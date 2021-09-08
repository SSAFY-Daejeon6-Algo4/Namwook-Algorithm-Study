package Algo_0815;

import java.util.*;
import java.io.*;

public class bj2116 {
	/** 백준 2116 주사위 쌓기 G4
	 * 도전!!!
	 * 예상풀이시간 Fail
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point :  
	 * 특이사항 : 주사위 합 7 규칙이 없으므로, 아무면이나 위로 온다고 가정하는 경우 6
	 *  		각면마다 해당하는 옆면 4, 위로 4가지와 중복순열해봐야하므로 모든 경우의 수 6*4^5 
	 *  		각 경우의 수마다 옆면의 합을 계산하는 함수 make
	 *  		result와 비교해서 최대값 저장 후 출력
	 *  		>> ☆☆☆이러면 시간초과당하고, 어차피 최대값구하는거니깐 옆면에서 최대값만 구하면 됩니다.
	 *  		어차피 돌려가면서 최대의 합만 구하는거니깐 ㅇㅇㅇ 옆면 정하는게 중요하고 그 면중에서 최대값만 골라서 더하세요. 
	 *  
	 * */
	public static int[][] dice;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		dice = new int[T][6];
		
		for(int i=0; i<T; ++i) {//
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<6; ++j) {
				dice[i][j]=Integer.parseInt(st.nextToken());//주사위 5개에 면 채워넣기. 
			}//dice for
		}//for T
		
		//주사위를 만들고나면 index05, 13, 24는 마주보므로 옆면이 될 수 없다.
		//1번 주사위 윗면 정하기 
		for(int i=0; i<6; ++i) {
			switch(i) {/** ☆☆ hint 윗면마다 인덱스가 다르기 때문에, 인덱스를 바꿔넣어줘서 공식을 만들 수 있다. */
				case 0:
					//index 5는 옆면이 될수 없음. 
					
					break;
				
				case 1:
					//index 3는 옆면이 될수 없음.
					break;
					
				case 2:
					//index 4는 옆면이 될수 없음.
					break;
					
				case 3:
					//index 1은 옆면이 될수 없음.
					break;
					
				case 4:
					//index 2는 옆면이 될수 없음.
					break;
					
				case 5:
					//index 0은 옆면이 될수 없음.
					break;
			}
		}
		
	}//main
}//package
