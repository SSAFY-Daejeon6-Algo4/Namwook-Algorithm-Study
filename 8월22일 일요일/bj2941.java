package Algo_0822;

import java.io.*;

public class bj2941 {
	/** bj2941 크로아티아 알파벳 S5
	 * 도전!!!!!!!!!
	 * 예상풀이시간 30분
	 * 시작시간 : 
	 * 끝난시간 : 
	 * key point : 
	 * 의도 : 보충수업에서 다뤘던 문제로 구현 중점으로 다시한번 복습. - 강사님 풀이랑 비교
	 * 		그 문자열을 배열을 만들어서 크로아티아 넣어주고
	 * 		start with을 사용해서 풀 수 있습니다. 
	 * 		공백으로 replaceAll을 썼다?
	 * */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt=0;								  //몇개의 문자로 이뤄졌는지 체크 변수
		char[] Arr = br.readLine().toCharArray(); //문자열을 받아서 1차원 배열에 넣어준다. 
		for(int i=0; i<Arr.length; ++i) {
			++cnt;
			
			if(Arr[i]=='-' || Arr[i]=='=') {	  // 그냥 알파벳 없이 -나 =가 올경우 세주면 안된다. 이부분 고민오래함.ㅏ				--cnt;
			}
			
			if(i<Arr.length-1) {
				switch(Arr[i]) {
					case 'c':
						if(Arr[i+1]=='=') {
							++i;
						}
						else if(Arr[i+1]=='-') {
							++i;
						}
						break;
					case 'd':
						if(i<Arr.length-2) {
							if(Arr[i+1]=='z'&& Arr[i+2]=='=') {
								i+=2;
							}
						}					
						else if(Arr[i+1]=='-') {
							++i;
						}
						break;
					case 'l':
						if(Arr[i+1]=='j') {
							++i;
						}
						break;
					case 'n':
						if(Arr[i+1]=='j') {
							++i;
						}
						break;
					case 's':
						if(Arr[i+1]=='=') {
							++i;
						}
						break;
					case 'z':
						if(Arr[i+1]=='=') {
							++i;
						}
						break;
					default:
						//위의 경우가 모두 아닌 경우
						continue;			
				}//switch
			}//if
		}//for
		System.out.print(cnt);
	}//main
}
