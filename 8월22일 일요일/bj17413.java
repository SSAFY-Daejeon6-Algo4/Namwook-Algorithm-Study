package Algo_0822;

import java.util.*;
import java.io.*;

public class bj17413 {
	/** bj 17413 단어 뒤집기2
	 * 도전!!!!!!!!!
	 * 예상풀이시간 30분
	 * 시작시간 : am 1:03
	 * 끝난시간 : 
	 * key point : stack 익숙해지기 / 문자를 문자열로(가장효율?String.valueOf()) / 스택사이즈 조절 실패
	 * 				메모리, 시간 xxxxxx -> 어떻게 해결??
	 * 
	 * 의도 : <를 만나기 전까진 다 스택에 넣기 / <를 만나면 다 꺼내고 / <부터 차례로 걍 출력 / >가 오면 그때부터 다시 스택에 넣기 / 
	 * 		문자열을 다 읽어왔으면 스택에서 거꾸로 다빼기    -> 스택, 조건문 필요
	 * 		
	 * 피드백 : stack.size()대신 while+isEmpty()를 활용하는게 실수를 줄일수잇는
	 * 			그리고 string builder를 활용해서 더해주는 식으로 코드 길이를 확 줄일 수 있다. 
	 * 			reverse() 메소드를 쓰네???
	 * 		
	 * 
	 * */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> stack = new Stack<>();	//char형으로 하려면 string?
		String str = br.readLine();
//		System.out.println(str); //줄단위로 잘 들어왔음.
//		System.out.println(str.length());
		
		String result ="";
		int i=0;
		
		//<가 아니면 스택에 들어오는 문자를 문자열로 변환해서 저장
 		while(i<str.length()) {	
			if(str.charAt(i)!='<' && str.charAt(i)!=' ') {//<와 공백이 아니면  
				stack.push(String.valueOf(str.charAt(i)));
				
				if(i==(str.length()-1)) {//i가 str과 길이가 같아지면 다 넣은거니깐
					//그때까지 스택에 저장된 내용 result에 다 넣어줘
					int z = stack.size();
					for(int k=0; k<z; ++k) {//k<stack.size() 이렇게 넣으면 계속 줄어들기 때문에 출력이 다 안된다....2시간 찾음
						result+=stack.pop();
					}
					break;
				}
				
				++i;//왜 i++하면 2가 나오지????
			}//if
			else if(str.charAt(i)=='<'){  //이쪽으로 왔다는건 <가 들어왔다는 의미니까 스택의 사이즈만큼 빈문자열에 저장
				if(stack.size()!=0) { //size가 0이 아니라면
					int z = stack.size(); 
					for(int j=0; j<z; ++j) {
						result+=stack.pop();
					}
				}
				
				//스택에 다 저장했으면 <부터 >까지 result에 넣어준다. <>의 짝을 맞춰준다했으므로 길이를 비교하는 조건문은 넣지않는다. 
				while(true) {
					if(str.charAt(i)=='>') {
						result+=str.charAt(i);
						++i;//아니여도 그대로 증가해야함....... 주의
						break;
					}
					result+=str.charAt(i);					
					++i;					
				}				
			}//<
			else { //문자열의 시작과 끝은 공백이 아니다.
				
				if(stack.size()!=0) { //size가 0이 아니라면
					int z = stack.size(); 
					for(int j=0; j<z; ++j) {
						result+=stack.pop();
					}
				}
				result+=" "; //공백을 만나면 스택을 모두 pop한뒤 공백을 추가해주고 인덱스 하나 증가 -> 깔끔하게 이해x 현재시간 4:09
				++i;
			}//' '
		}//while
 		System.out.print(result);				
	}		
}
