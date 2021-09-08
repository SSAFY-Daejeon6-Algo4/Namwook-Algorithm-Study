package Algo_0818;

import java.util.*;
import java.io.*;

public class swea1234 {
	/** SWEA 1234 비밀번호
	 * 도전!!!!!!!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : 
	 * 의도 : 지금 생각나는건 문자열을 문자배열로 만들어서 인덱스와 인덱스+1을 비교한다. 
	 * 		겹치는 순간, 둘다 공백으로 채워넣는다. 그 순간부터 양옆으로 비교하기 시작한다. 
	 * 		있으면 계속 공백저장, 없으면 문자열로 저장해주고 문자열 출력하고 죵료.
	 * 
	 * 		배열로는 못풀었고 + list hint
	 * */
	public static void main(String[] args) throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		for(int i=0; i<10; ++i) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int len = Integer.parseInt(st.nextToken());//길이
//			char[] code = st.nextToken().toCharArray();
//			int tmp=0;//code 배열에서 인덱스 컨트롤 
//			int pp =0;//리얼코드 인덱스
//			char[] real_code=new char[len];
//		
//			for(int j=1; j<len; ++j) {//code 배열  0항부터 다음항과 비교하기 시작
//				if(code[j]==code[tmp]) {//같은게 발견되면
//					code[j]=' ';
//					code[tmp]=' ';
//					--tmp;
//					//처음에 다다르면 j-1로 다시 넣어주나보다.
//				}
//				else {
//					tmp=j;
//				}
//			}		
//			
//			for(int j=0; j<code.length; ++j) {
//				if(code[j]!=' ') {
//					real_code[pp]=code[j];
//					++pp;//리얼코드의 인덱스는 조건부에 따라 따로 control
//				}
//			}
//			
//			System.out.println("#"+(i+1)+" "+String.valueOf(real_code));
//		}//테케for
		
		
		/**ArrayList*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<10; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<String> code = new ArrayList<String>();// integer로 받지마세요.
			
			int len = Integer.parseInt(st.nextToken());//암호문의 길이
			String s = st.nextToken();//암호문
			
			//리스트에 문자열 넣기		
			for(int j=0; j<len; ++j) {
				code.add(s.substring(j,j+1));		
			}

//			code 확인
//			for(int j=0; j<code.size(); ++j) {
//				System.out.print(code.get(j));
//			}
//			System.out.println();
			
			//리스트를 진행하면서 다음항과 일치하는 항 삭제하기
			for(int k=0; k<code.size()-1; k++) {//계속 k가 1부터로 들어가나봐
				if(code.get(k).equals(code.get(k+1))) { //문자열 비교 실수 반복
					code.remove(k);
					code.remove(k);//인덱스 주의..
					k=-1;//인덱스가 바뀌니깐 다시 처음부터
				}
			}
			
			//다 돌고나오면 삭제될건 삭제되고 남을건 남았다는 뜻이니깐.
			System.out.print("#"+(i+1)+" ");
			for(int k=0; k<code.size(); ++k) {
				System.out.print(code.get(k));
			}//출력for
			System.out.println();
		}//테스트케이스10for
						//++ 자료구조를 활용할 수 잇따. 
	}//main
}//클래스
