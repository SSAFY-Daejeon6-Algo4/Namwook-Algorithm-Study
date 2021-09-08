package Algo_0815;

import java.util.*;
import java.io.*;

public class bj2628 {
	/** 백준 2628 종이자르기 S5
	 * 도전!!!!!!!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 12:43
	 * 끝난시간 : ??
	 * key point : 
	 * 특이사항 :  아이디어 도움, 맵그릴필요 없었음, arraylist 사용법 및 정렬방법 추가 숙지 요망
	 * */
	
	public static int xstart, ystart, x, y, tmp, result;	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());//가로, 세로 : 최대 100
		int h = Integer.parseInt(st.nextToken());//10,8	
		ArrayList<Integer> garo = new ArrayList<Integer>();//리스트 연습
		garo.add(0);
		garo.add(w);//(0,10)
		ArrayList<Integer> sero = new ArrayList<Integer>();//대부분 이런 형태로 선언하나?
		sero.add(0);
		sero.add(h);	
		x=0;  		
		y=0;	
		tmp=0;
		result=0;//넓이는 음수가 나올수 없으니. 
		
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st3.nextToken());//점선의 개수 
		
		for(int i=0; i<T; ++i) {			
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int rc = Integer.parseInt(st2.nextToken());//0,1 - 가론지 세론지
			int num = Integer.parseInt(st2.nextToken());//점선 번호
			//행, 세로 , y // 열, 가로, x : 확인할 것..
			
			if(rc==1) {				
				garo.add(num);
			}
			else if(rc==0) {
				sero.add(num);
			}		
		}//for	
		
		Collections.sort(garo);
		Collections.sort(sero); //정렬
		
		for(int i=1; i<garo.size(); ++i) {
			x=garo.get(i)-garo.get(i-1);
			//System.out.println(x);
			//System.out.println("구별용");
			for(int j=1; j<sero.size(); ++j) {
				y=sero.get(j)-sero.get(j-1);
				//System.out.println(y);
				tmp=x*y;
				if(result<tmp) {
					result=tmp;
				}
			}
		}		
		
//		for(Integer i:garo) {//새로운 반복문 익숙해지기 
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		
//		for(Integer i:sero) {
//			System.out.print(i+" ");
//		}	
//		System.out.println();
		
		System.out.println(result);
	}//main
}//package


