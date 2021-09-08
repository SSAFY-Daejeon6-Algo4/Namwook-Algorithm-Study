package Algo_0808;

import java.util.*;
import java.io.*;
public class bj14696 {
	/** 백준 14696 딱지놀이 B1
	 * 도전해야할 문제여서 + 풀 수 있을 것 같았습니다3.
	 * 예상풀이시간 1시간
	 * 시작시간 : am 00:13
	 * 끝난시간 : am 01:58
	 * key point : i++와 ++i의 차이를 깨닫지못했음. 계속 32점인데 어디서 틀리고 있는가 + 문제이해를 완전잘못함
	 * 애로사항 : 일단 문제 이해가 어렵다. 
	 * */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int N = Integer.parseInt(br.readLine()); //예외안해주면 여기서 오류걸림. 전체 라운드 수  5 
		
		for(int i=0; i<N; ++i) {//라운드 수 만큼 반복			
			int[] A_Result=new int[6];
			int[] B_Result=new int[6];			
			String s = br.readLine(); //1 4
			StringTokenizer st = new StringTokenizer(s);
			int A_num = Integer.parseInt(st.nextToken()); // A가 낼 문양의 수, a_num==1
			for(int j=0; j<A_num; ++j) {
				int a_num = Integer.parseInt(st.nextToken()); //4
				if(a_num == 4) {
					A_Result[a_num]+=1; //오!++++++
				}
				else if(a_num==3) {
					A_Result[3]+=1;
				}
				else if(a_num==2) {
					A_Result[2]+=1;
				}
				else{
					A_Result[1]+=1;
				}
							
			}
			
			String s2 = br.readLine(); 
			StringTokenizer st2 = new StringTokenizer(s2);
			int B_num = Integer.parseInt(st2.nextToken()); // B가 낼 문양의 수
			
			for(int j=0; j<B_num; ++j) {
				int b_num = Integer.parseInt(st2.nextToken());
				// if(st2.nextToken()  equls of  "4")
				if(b_num == 4) {
					B_Result[4]+=1;
				}
				else if(b_num==3) {
					B_Result[3]+=1;
				}
				else if(b_num==2) {
					B_Result[2]+=1;
				}
				else{
					B_Result[1]+=1;
				}
			}
			
			//한라운드가 끝났음 -> 승패를 도출해야지 
			//for문을 활용할 수 있다. 이렇게 rough하게 쓸 필요가 없다. ★★★★★
			if(A_Result[4]>B_Result[4]) {
				System.out.println("A");
			}
			else if(A_Result[4]<B_Result[4]){
				System.out.println("B");
			}
			else {
				if(A_Result[3]>B_Result[3]) {
					System.out.println("A");
				}
				else if(A_Result[3]<B_Result[3]) {
					System.out.println("B");
				}
				else {
					if(A_Result[2]>B_Result[2]) {
						System.out.println("A");
					}
					else if(A_Result[2]<B_Result[2]) {
						System.out.println("B");
					}
					else {
						if(A_Result[1]>B_Result[1]) {
							System.out.println("A");
						}
						else if(A_Result[1]<B_Result[1]) {
							System.out.println("B");
						}
						else {
							System.out.println("D");
						}
					}
				}
			}			
			
		}//for end		

	}//main end

}
