package Algo_0825;

import java.util.*;
import java.io.*;

public class swea1974 {
	/**
	 * SWEA 1974 스도쿠 검증 D2
	 * 스도쿠의 룰을 잘 파악할 것.
	 * set 사용시 조금 더 쉬운 코드 가능. hashset은 정렬x treeset은 정렬 ㅇ
	 * 정렬은 필요없기 때문에 hash set을 이용해봅니다.
	 * 
	 * 일단 입력을 모두 받아넣고 테스트해보는게 좋을 듯?? 행/열 모두를 비교해야 하므로
	 * 
	 * 초기화 위치 제발..
	 * hashset생성, 타입파라미터 생략하고 만들거나 초기개수, 값 지정 가능
	 * add, clear는 암기할 것.
	 * 
	 * */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> sudo = new HashSet<Integer>(9);//()선언  or(용량1~9)
		HashSet<Integer> sudo2 = new HashSet<Integer>(9); //행열 테스트 
		HashSet<Integer> sudo3 = new HashSet<Integer>(9); //3*3 test
		
		int[][] testArray = new int[9][9];	

		int T = Integer.parseInt(br.readLine());//
		for(int i=0; i<T; ++i) {
			int result =1;//스도쿠 합불 여부, 초기화위치 어제부터 중요하다고 계쏙 말하는데 2시간 넘게 헤맨듯
			//9*9이므로
			for(int j=0; j<9; ++j) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int k=0; k<9; ++k) {
					testArray[j][k]=Integer.parseInt(st.nextToken());
				}
			}
			
//			for(int j=0; j<9; ++j) {
//				//StringTokenizer st = new StringTokenizer(br.readLine());
//				for(int k=0; k<9; ++k) {
//					System.out.print(testArray[j][k]+" ");
//				}System.out.println();
//			}
			
			//다 저장 후 나오면 99배열이 완성되어있을테니깐, 행
			for(int j=0; j<9; ++j) {
				sudo.clear();
				for(int k=0; k<9; ++k) {
					sudo.add(testArray[j][k]);					
				}//한 행
				if(sudo.size()!=9) {
					result=0;
					break;				
				}
				//System.out.println(sudo.toString());
			}	
			
			//열
			for(int j=0; j<9; ++j) {
				sudo2.clear();
				for(int k=0; k<9; ++k) {
					sudo2.add(testArray[k][j]);
				}
				if(sudo2.size()!=9) {
					result=0;
					break;
					
				}
			}	
			
			//3*3
			for(int tmp=0; tmp<3; ++tmp) {
				for(int tmp2=0; tmp2<3; ++tmp2) {
					sudo3.clear();
					for(int j=3*tmp; j<3*tmp+3; ++j) {
						for(int k=3*tmp2; k<3*tmp2+3; ++k) {
							sudo3.add(testArray[j][k]);
						}					
					}
					if(sudo3.size()!=9) {
						result=0;
						break;					
					}
				}
			}					
			System.out.println("#"+(i+1)+" "+result);		
		}//t for
	}//main
}//class
