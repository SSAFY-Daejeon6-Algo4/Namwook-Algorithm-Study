package Algo_0803;

import java.util.*;

//bj 2309 일곱난쟁이
public class bj2309 { 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		/** 초기 입력받는 구문 및 변수 정리 */
		int n = 9; //난쟁이 총인원
		int[] dwarf = new int[n];//배열
		int sum = 0;//합계
		boolean statue = false;
		
		//반복문돌려서 배열에 입력값 저장
		for(int i=0; i<n; i++) {
			dwarf[i] = sc.nextInt(); // 오타..
			sum+=dwarf[i];
		} // java.util.NoSuchElementException  > 스캐너 관련 이슈  > 토큰없는데 계속 요구해서 생기는 오류
		
		//반복문돌리면서 합이 100이 되는 조건을 산출하고 조건에 맞으면 탈출
		for(int i=0; i<n; i++) {
			if(statue) break;
			for(int j=0; j<n; j++) {
				if(i==j) {//두 항이 같으면 배열의 같은 인덱스, 즉 같은 난쟁이이므로 pass
					continue;
				}
				if(sum - dwarf[i] - dwarf[j] == 100) {
					dwarf[i]=0;
					dwarf[j]=0;//정렬 + 출력할건데 0으로 채워주면 정렬시 자동으로 앞으로 밀릴테니깐. 
					statue = true;
					break;
				}
			}
		}
		sc.close();      
		//토크나이저 : 
		//정렬 후 출력하는데, 앞에 0두개가 올것이므로 2항부터 출력?
		Arrays.sort(dwarf);
		for(int i=2; i<n;  i++) {
			System.out.println(dwarf[i]);
		}		
	}
}
