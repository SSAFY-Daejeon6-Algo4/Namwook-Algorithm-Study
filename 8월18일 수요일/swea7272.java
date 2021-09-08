package Algo_0818;

import java.util.*;
import java.io.*;

public class swea7272 {
	/** SWEA 7272 안경이 없어!! D3
	 * 도전!!!!!!!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : 문자열 비교equals다시, 문자열.toCharArray(), Character.toString(문자배열),
	 * 				문자열.contains(문자열),  String.valueOf(문자배열);
	 * 				다섯개 메소드??
	 * 특이사항 : 
	 * */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		//비교할 문자와 문자 배열
		String q = "CEFGHIJKLMNSTUVWXYZ";
		String w = "ADOPQR";
		String e = "B";
		
		//테스트 케이스 돌면서
		for(int i=0; i<T; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			//입력이 들어오는 문자열
			char[] a1 = st.nextToken().toCharArray(); //ABCd
			char[] b1 = st.nextToken().toCharArray(); //efgh
			
			char[] a2 = new char[a1.length];
			char[] b2 = new char[b1.length];
			
			//입력 문자열을 비교하기 쉽게 변경
			for(int j=0; j<a1.length; ++j) {
				if(q.contains(Character.toString(a1[j]))) {
					a2[j]='1';
				}
				else if(w.contains(Character.toString(a1[j]))) {
					a2[j]='2';
				}
				else if(e.contains(Character.toString(a1[j]))) {
					a2[j]='3';
				}
				else {
					a2[j]='0';
				}
			}
			
			for(int j=0; j<b1.length; ++j) {
				if(q.contains(Character.toString(b1[j]))) {
					b2[j]='1';
				}
				else if(w.contains(Character.toString(b1[j]))) {
					b2[j]='2';
				}
				else if(e.contains(Character.toString(b1[j]))) {
					b2[j]='3';
				}
				else {
					b2[j]='0';
				}
			}
			
			String tmp_a = String.valueOf(a2);
			String tmp_b = String.valueOf(b2);
			
			//만들어진 두 임시 문자 배열을 비교해서 동일하면
			if(tmp_a.contains(tmp_b) && tmp_a.length()==tmp_b.length() ) {
				System.out.println("#"+(i+1)+" "+"SAME" );
			}
			else {
				System.out.println("#"+(i+1)+" "+"DIFF" );
			}
			
			
		}//testcase for
	}//main

}
