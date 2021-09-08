package Algo_0818;

import java.util.*;
import java.io.*;

public class bj11399 {
	/** bj 11399 ATM S3
	 * 도전!!!!!!!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : 정렬한다음에 한항씩 더하는게 키 포인트 같은데 원리를 이해하지 못했음... 왜??
	 * 				더해지는 수가 누적이 되는데, 큰수를 더해주면 큰수가 계속해서 누적되고 합이 증가하므로! 
	 * 				라고 이해했습니다.
	 * 의도 : 
	 * */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] atm = new int[T];//정렬 대상이 되는 atm 배열
		int sum=0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<T; ++i) {//입력값을 배열에 저장한다. 
			atm[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(atm);//정렬
		
		
		for(int i=1; i<T; ++i) {
			atm[i]=atm[i]+atm[i-1];
			sum+=atm[i];			
		}
		sum+=atm[0];
		System.out.println(sum);
	}

}
