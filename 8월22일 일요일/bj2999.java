package Algo_0822;

import java.util.*;
import java.io.*;

public class bj2999 {
	/** bj 2999 비밀이메일 b1
	 * 도전!!!!!!!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : 입력받은 문자열의 길이를 바탕으로 원하는 조건의 배열을 어떻게 만들 수 잇지? 
	 * 의도 : 
	 * */
	public static char[][] email;
	public static int R,tmp;
	public static String str2;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();//문자열을 받아놓고
		int N = str.length();//길이측정
		R=0;//행을 정하기 위한 변수 
		tmp=0;
		str2="";//결과 문자열 초기화
		
		for(int i=1; i<=N; ++i) {//조건에 맞는 하에서 최대 행 구하기 > 전부다 NN으루 넣어줬음.
			for(int j=1; j<=N; ++j) {
				if(i*j==N && i<=j) { //둘의 곱이 N인데 행이 열을 넘지 않는 선에서 + &&을 안써줘서 헤맸음.
					R=Math.max(i, R); //조건을 만족하는 행 중에서 최대를  R에 저장 ++
				}
			}
		}//R구하기 for

		email = new char[R][N/R];//최대행을 바탕으로 2차원배열을 만들고 ★
		for(int i=0; i<(N/R); ++i) {//2차원 배열에 규칙에 따라서 넣은다음에
			for(int j=0; j<R; ++j) {//행이 먼저변하고, 열이 그다음으로 변하는 규칙
				email[j][i]=str.charAt(tmp); //문자열 안의 한글자 한글자를 순서대로 넣어줘야하므로 charAt 사용
				++tmp;
			}					
		}
		
		//문자열을 읽어줘야한다. str2에 for문을 이용해서 문자를 더해준다. 
		for(int i=0; i<R; ++i) {
			for(int j=0; j<(N/R); ++j) {//정해진 행, 열 수만큼.
				str2+=email[i][j];
			}
		}
		System.out.println(str2);//아니면 들어오는 문자 그대로 다 더해서 print로 붙여서 출력하기
		
	}//main
}//class
