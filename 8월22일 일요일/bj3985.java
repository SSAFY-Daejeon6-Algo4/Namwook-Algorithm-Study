package Algo_0822;

import java.util.*;
import java.io.*;

public class bj3985 {
	/** bj 3985 롤 케이크
	 * 도전!!!!!!!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : 
	 * 의도 : 아직까진 메모리와 시간을 생각하지않고 푸는 데에 집중 중. 어느정도 실력이 쌓이면 이러한 부분도 해결할 수 있도록 노력 요망. 
	 * */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MIN_VALUE;
		int L = Integer.parseInt(br.readLine()); //롤케잌 길이
		int N = Integer.parseInt(br.readLine()); //방청객 수 
		int cnt=0;								 //실제로 받는 케잌 수 측정 
		int predict=0;
		int[] RealLollCake = new int[L+1];		 //실제로 받을 수 있는 롤 케잌 크기 체크용 배열
		int[] N_num = new int[N+1];				 //방청객 당 케잌 수 체크용 배열
		int[] Predict_cake = new int[N+1];		 //방청객 당 예측하는 케잌 수 체크용 배열
		
		for(int i=1; i<=N; ++i) {
			cnt=0;								 //초기화를 자꾸 잊네..
			StringTokenizer st = new StringTokenizer(br.readLine());
			int pi = Integer.parseInt(st.nextToken());
			int ki = Integer.parseInt(st.nextToken());
			Predict_cake[i] = ki-pi;			//예측하는 케잌 수를 방청객 번호와 맞춰서 저장해준다. 
			for(int j=pi; j<=ki; ++j) {
				if(RealLollCake[j]==0) {		//0인경우(아무도 선택하지않은 경우)에만 1로 채워주면서 cnt를 늘린다.
					RealLollCake[j]=1;
					++cnt;
				}//if
				else {
					continue;					
				}
				
			}//j for 
			N_num[i]=cnt;						//각 번호의 방청객당 받을 수 있는 케잌의 수 
		}//i for								//방청객마다 모든 케잌의 수가 입력이 되면 
		
		//다 돌고나왔으면 가장많이 케잌을 받은 조각수를 체크
		for(int i=1; i<N_num.length; ++i) {
			max = Math.max(max, N_num[i]);
		}
		
		//본인이 가장 많이 받을거라고 생각하는 고객 번호
		for(int i=1; i<Predict_cake.length; ++i) {
			predict = Math.max(predict, Predict_cake[i]);
		}
		
		for(int i=1; i<Predict_cake.length; ++i) {		//가장 많은 케잌을 받을거라 예측하는 고객 번호 
			if(predict==Predict_cake[i]) {				//예측수치 최대치와 일치하는 해당배열의 인덱스를 출력
				System.out.println(i);					//중복되면 제일 먼저 나오는 번호만 제출하고 나가야함.
				break;
			}
		}	
		
		
		for(int i=1; i<N_num.length; ++i) {		//실제로 가장많이 받은 고객 번호
			if(max==N_num[i]) {					//Nnum행렬을 돌면서 max와 일치하는 원소를 가진 인덱스가 있다면 인덱스 반환
				System.out.println(i);			//중복되면 제일 먼저 나오는 번호만 제출하고 나가야함.
				break;
			}
		}
		
	}//main

}
