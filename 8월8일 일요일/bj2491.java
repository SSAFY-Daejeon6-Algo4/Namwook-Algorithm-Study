package Algo_0808;

import java.util.*;
import java.io.*;

public class bj2491 {
	/** 백준 2491 수열 S3
	 * 도전해야할 문제여서 + 풀 수 있을 것 같았습니다.
	 * 예상풀이시간 1시간
	 * 시작시간 : am ?
	 * 끝난시간 : am 4:41
	 * key point : 배열을 저장하고 각자 길이를 비교하면서 최대길이, 최소길이를 산출하는 과정이 많이 헷갈렸습니다. 
	 * 아직 긴가민가하지만 비슷한 유형을 더풀면 익숙 해질 것 같습니다. 
	 * 애로사항 : 
	 * */
	public static void main(String[] args) throws Exception{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());// 수열의 길이가 들어오고
		int max=0;//증가하는지
		int min=0;//감소하는지
		int up=0;//얼만큼 증가햇는가
		int down=0;//얼만큼 감소햇는가 
		int[] num2=new int[T];
		
		StringTokenizer st = new StringTokenizer(br.readLine());//위치 주의
		
		for(int i=0; i<T; ++i) {//i++ i<1
			int num=0;			
			 // default 공백으로 받는것 같습니다.
			num=Integer.parseInt(st.nextToken());//nextToken이여도 문자열로 들어온다.
			//System.out.print(num);
			num2[i]=num;
		}
		
		//일단 num2배열에 들어오는 수들을 다 담고		
		for(int i=0; i<T-1; ++i) {
			if(num2[i]<num2[i+1]) {
				++max;
				if(max>=up) up=max;
				min=0;
			}
			else if(num2[i]==num2[i+1]){
				++max;
				++min;
				if(max>=up) up=max;
				if(min>=down) down=min;
			}
			else {
				++min;
				if(min>=down) down=min;
				max=0;
				
			}			
		}
		
		if(up>=down) {
			System.out.println(up+1);
		}
		else {
			System.out.println(down+1);
		}
	}
	//2중 for문이 제일 쉬운 방법 
}
