package Algo_0822;

import java.util.*;
import java.io.*;

public class bj2991 {
	/** bj 2991 사나운 개 b3
	 * 도전!!!!!!!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : 무는 시간+쉬는시간의 합으로 오는 시간을 나눠서 나머지와 무는 시간을 비교하는 식으로 계산했습니다. 
	 * 				무는 시간이 2분이라면 2분까지 무는 시간에 포함됨을 주의.
	 * 				나머지가 0이면 물+쉬에서 쉬는시간에 딱걸리므로 더해주지않고 공격받지않는다고 판단했습니다.
	 * 의도 : 
	 * */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int[] AnB = new int[4];	//개의 공격시간, 쉬는시간 저장할 배열
		StringTokenizer st = new StringTokenizer(br.readLine());		
		for(int i=0; i<4; ++i) {//개의 공격시간, 쉬는시간 저장
			AnB[i] = Integer.parseInt(st.nextToken());
		}
		
//		for(int i=0; i<4; ++i) {
//			System.out.print(AnB[i]+" ");
//		}
		//도착시간을 공격+쉬는시간의 합으로 나눈 나머지가 공격시간보다 작으면 + 합으로 나눠떨어지면 나머지가 0인데 그러면 공격x인 경우만 더해준다.
		int pAttack=0;//우체부 방문시간
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int postman = Integer.parseInt(st2.nextToken());
		if(((postman)%(AnB[0]+AnB[1]))<=AnB[0] && ((postman)%(AnB[0]+AnB[1]))>0) {
			++pAttack;//우체부와 a개의 공격/쉬는 시간 비교해서 공격받는 횟수
		}
		if(((postman)%(AnB[2]+AnB[3]))<=AnB[2] && ((postman)%(AnB[2]+AnB[3]))>0) {
			++pAttack;//우체부, b개
		}		
		
		int mAttack=0;//우유배달부, a개 공격받는 횟수
		int milkman = Integer.parseInt(st2.nextToken());
		if(((milkman)%(AnB[0]+AnB[1]))<=AnB[0] && ((milkman)%(AnB[0]+AnB[1]))>0) {
			++mAttack;
		}
		if(((milkman)%(AnB[2]+AnB[3]))<=AnB[2] && ((milkman)%(AnB[2]+AnB[3]))>0) {
			++mAttack;
		}
		
		int nAttack=0;//뉴스맨, a,b개 순서
		int newsman = Integer.parseInt(st2.nextToken());
		if((newsman)%(AnB[0]+AnB[1])<=AnB[0] && (newsman)%(AnB[0]+AnB[1])>0) {
			++nAttack;
		}
		if((newsman)%(AnB[2]+AnB[3])<=AnB[2] && (newsman)%(AnB[2]+AnB[3])>0) {
			++nAttack;
		}
		
		System.out.println(pAttack);
		System.out.println(mAttack);
		System.out.println(nAttack);		
	}
}
