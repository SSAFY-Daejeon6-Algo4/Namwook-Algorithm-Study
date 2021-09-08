package Algo_0829;

import java.util.*;
import java.io.*;

public class swea6730 {
	/** swea 6730  장애물 경주 난이도 D3
	 * 
	 * 링크드리스트 - 큐 ★★★
	 * replaceAll대신에 trim써주면 양옆의 공백 다 제거해줍니다.
	 * 
	 * 
	 * 문자열 공백 제거해주는것 	//numberformat exception은 문자열에서 공백을 제거해주고 다시 넣는다. .replace(" ","")
	 * */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int T = Integer.parseInt(br.readLine().replaceAll(" ",""));//테스트 케이스		
		for(int i=0; i<T; ++i) {
			int up=0;//상향치와 하향치를 기록할 변수 선언
			int down=0;
			int N = Integer.parseInt(br.readLine());//블록 개수
			int[] tmp = new int[N];//개수만큼의 블록을 저장할 배열
			StringTokenizer st = new StringTokenizer(br.readLine());//각 블록들을 읽어들인다.			
		
			for(int j=0; j<N; ++j) {
				tmp[j]=Integer.parseInt(st.nextToken());//배열에 블록들 저장
			}
			
			for(int j=0; j<N-1; ++j) {//N>=2, 저장된 배열의 마지막 전항까지. 
				if(tmp[j]>tmp[j+1]) {//앞항>뒷항, 내려간다 9 8
					down=Math.max(down,tmp[j]-tmp[j+1]); //제일 큰 하향을 저장해준다.				
				}
				else if(tmp[j]<tmp[j+1]) {//앞항<뒷항, 올라간다
					up=Math.max(up,tmp[j+1]-tmp[j]);
				}
//				else { //이 부분 때문에 fail > 아마도 증감있고 그다음에 다 같은 케이스가 있는듯. 
//					up=0;
//					down=0;
//				}				
			}			
			System.out.println("#"+(i+1)+" "+up+" "+down);	
		}	
		br.close();
	}//main
}//class
