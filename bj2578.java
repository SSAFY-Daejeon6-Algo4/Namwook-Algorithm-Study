package Algo_0803;

import java.util.*;

public class bj2578 {
	public static void main(String[] args) {
		// 백준2578 빙고
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<M; j++) {
				if(i!=j) {
					System.out.print(i);
				}					
			}System.out.println();
		}		
	}
}
