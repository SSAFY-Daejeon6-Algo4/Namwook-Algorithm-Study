package Algo_0829;

import java.util.*;
import java.io.*;

public class boj2164 {
	/** boj2164 카드2 S4
	 * 동적이므로 리스트 사용, 카드를 넣고 
	 * 1.길이 체크 (1일 시 중단)
	 * 2.맨 앞의(맨위의) 카드를 버린다. 
	 * 3.그다음카드를 빼서 맨 뒤에 새로 위치시킨다. 
	 * 2,3 반복
	 * 
	 * stringbuilder 사용
	 * list 메소드 : get, remove리턴값, 
	 * 
	 * 시간초과 질문>>>외않되 >> 해결했음 어레이 대신에 링크드를 써야합니다. 
	 * 
	 * */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //N 입력		
		LinkedList<Integer> cards = new LinkedList<Integer>();//리스트   //Linked로 해야 시간 통과 > 자료구조
		
		//1.리스트에 N까지의 수를 순서대로 넣는다. 
		for(int i=1; i<=N; ++i){
			cards.add(i);	
		}
		
		//2.리스트의 크기가 1일때까지 반복
		while(cards.size()!=1) {//size는 계속 바뀐다. 이점 유의
			cards.remove(0);//첫번째 원소 제거			
			cards.add(cards.remove(0));//두번째 원소는 뒤에 넣어준다. //시간초과가 나는게 여기서 걸리는 것 같습니다.
		}
		//리스트 남은 원소 출력
		System.out.println(cards.get(0));//인덱스0번만 남아있으니깐.
		br.close();
	}//main
}//class
