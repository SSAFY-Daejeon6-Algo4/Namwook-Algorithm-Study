package Algo_0815;

import java.util.*;
import java.io.*;
/**디버깅!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1*/
public class bj10158 {
	/** 백준 10158 개미 S5 + 수학문제.........
	 * 도전!!!
	 * 예상풀이시간 1시간
	 * 시작시간 : 
	 * 끝난시간 : fail
	 * key point : 
	 * 특이사항 :  
	 * */
	public static int w, h, p, q, t, t1, t2;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());//map
		int h = Integer.parseInt(st.nextToken());	
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st2.nextToken());//초기 좌표
		int q = Integer.parseInt(st2.nextToken());
		
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st3.nextToken());//움직인 시간
		
		move();
	}
	
	public static void move() {//메소드화 하기 연습할것. + 델타 탐색??
		//1초마다의 움직임.
		int x=p;
		int y=q;
		int i=0;
		t1 = 1;
		t2 = 1;
//		System.out.print(x+" "+y+" "+i);
//		System.out.println();
		
		//최종위치 좌표로 출력
		while(true) {		
			//1시간뒤 x+1, y+1 2시간뒤 x+2, y+2잖아.
			//System.out.println("test");
			if(x==w) {
				if(y==h) {t1=-1; t2=-1;} //w,h
				else if(y==0) {t1=-1; t2=1;} //w,0
				else {//0<y<h
					if(t1>0 & t2>0) {t1=-1; t2=1;}//올라가는 경우
					else {t1=-1; t2=-1;}//내려오는 경우
				}
				++i;
			}
			else if(x==0) {
				if(y==h) {t1=1; t2=-1;}//0,h
				else if(y==0) {t1=1; t2=1;}//0,0	
				else {//0<y<h
					if(t1<0 & t2>0) {t1=1;}//올라가는 경우
					else {t1=1;}//내려오는 경우
				}
				++i;
			}
			else if(y==h) {
				if(x==w) {t1=-1; t2=-1;}//w,h
				else if(x==0) {t1=1; t2=-1;}//0,h	
				else {//0<x<w
					if(t1<0 & t2>0) {t2=-1;}//좌로 기울어진
					else {t2=-1;}//우로 기울어진
				}
				++i;
			}
			else if(y==0) {
				if(x==w) {t2=1;}//w,0
				else if(x==0) {t1=1; t2=1;}//0,0	
				else {//0<x<w
					if(t1<0 & t2<0) {t2=1;}//좌
					else {t2=1;}//우
				}
				++i;
			}
			x+=t1;
			y+=t2;
			++i;
			if(i>8) break;
		}	
		System.out.print(x+" "+y);		
	}
}
