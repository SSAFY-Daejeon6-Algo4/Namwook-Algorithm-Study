package Algo_0825;

import java.util.*;
import java.io.*;

public class swea1859 {
	/**
	 * SWEA 1859 백만 장자 프로젝트 D2
	 * um...
	 * */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		ArrayList<Integer> money = new ArrayList<Integer>();
		//ArrayList<Integer> money2 = new ArrayList<Integer>();
		int max_profit=0;
		for(int i=0; i<T; ++i) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; ++j) {
				money.add(Integer.parseInt(st.nextToken()));				
			}
			
			
			
			
			System.out.println("#"+(i+1)+" "+max_profit);
		}
		
	}

}
