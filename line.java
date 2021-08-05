package Algo_0803;

// 2309 줄 세우기
import java.io.FileInputStream;

// bj 2605 줄 세우기

import java.util.*;

public class line {
	
	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("test_input.txt"));
		Scanner sc = new Scanner(System.in);
		//스캐너가 시간을 많이 잡는다. 버퍼드 리더★★★★★
		
		/** 초기 입력받는 구문 및 변수 정리 */
		int T = sc.nextInt(); //학생 수 
		ArrayList<Integer> s = new ArrayList<Integer>();
		//int temp=0;
			
		for(int i=0; i<T; i++) {
			s.add(i,i+1);//원래 학생번호가 담긴다.
		}
		
		for(int i=1; i<=T; i++) {
			//들어오는 수 차례대로 받아서 저장
			int num = sc.nextInt();// 여러번 호출하면 계속 뒤로 밀리며 담아온다.  
			s.add(i-num, i);				
		}
		
		//출력
		for(int i=1; i<=T; i++) {
			System.out.print(s.get(i)+" ");
		}
	}
}
