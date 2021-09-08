package Algo_0808;

import java.util.*;
public class bj13300 {
	/** 백준 13300 방 배정 B2
	 * 도전해야할 문제여서 + 풀 수 있을 것 같았습니다.
	 * 예상풀이시간 1시간
	 * 시작시간 : am 9:16
	 * 끝난시간 : am 10:27
	 * key point : 정말 단순하게 쌩으로 노가다 + 출력하는 for문 위치 파악 miss로 시간 소요 
	 * 애로사항 : 시간복잡도가 너무 큰것같다.
	 * */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Students_Number = sc.nextInt(); //총 학생수
		int Max = sc.nextInt(); //방 최대 인원 수 
		int rooms = 0; //필요한 방 count
		int[][] gnx = new int[6][2]; // 학년별로 성별은 filter로 측정 생각
		
		for(int test_case=0; test_case<Students_Number; test_case++){
			int sex = sc.nextInt();//성별
			int grade = sc.nextInt();//학년 순으로 들어오는데, 
			// 이 수들을 받아서 배열에 넣으면 학년별 인원은 파악됏음. 받으면서 성별도 파악해야할듯
//			System.out.println(grade);
//			System.out.println(sex);//학년성별 제대로 들어오는디 
//			System.out.println(Max); 최대인원수도 제대로 들어왔음
			switch(grade) {
				case 1:
					if(sex==1) {//남1여0
						gnx[0][1]+=1;}
					else {
						gnx[0][0]+=1;}				
					break;
				case 2:
					if(sex==1) {
						gnx[1][1]+=1;}
					else {
						gnx[1][0]+=1;}				
					break;
				case 3:
					if(sex==1) {
						gnx[2][1]+=1;}
					else {
						gnx[2][0]+=1;}				
					break;
				case 4:
					if(sex==1) {
						gnx[3][1]+=1;}
					else {
						gnx[3][0]+=1;}				
					break;
				case 5:
					if(sex==1) {
						gnx[4][1]+=1;}
					else {
						gnx[4][0]+=1;}				
					break;
				case 6:
					if(sex==1) {
						gnx[5][1]+=1;}
					else {
						gnx[5][0]+=1;}				
					break;
				default:
					break;
			}//이 부분 코드 어떻게 줄일 수 없을까...? 3차원 배열??
			//학년 별로 남녀인원 체크 후 k랑 비교해서 방 개수 산출 for문 다 돌아야하네.
			
		//한 테스트 케이스를 다돌면 나가서 인원 출력		
		}
		for(int i=0; i<6; i++) {
			for(int j=0; j<2; j++) { //학년, 인원 수
				if(gnx[i][j]!=0 && gnx[i][j]<Max) {
					//학년, 성별의 인원수가 입력받은 방당최대인원수보다 작으면 방1개 배정 
					rooms+=1;
					//System.out.println("어디서더해짐?");
				}
				else if(gnx[i][j]!=0) { 
					//학년, 성별의 인원수가 입력받은 방당최대인원수보다 크면
					//나누기해서 몫만큼 방 추가하고 나머지만큼 방+1
					rooms+=(gnx[i][j]/Max);
					//System.out.println("어디서더해짐????");
					if((gnx[i][j]%Max)>0) {
						//나머지가 생기면 +1, 나눠떨어지면 안해줘도됨. 
						rooms+=1;
						//System.out.println("어디서더해짐??????");
					}
				}
			}
		}
//		for(int i=0; i<6; i++) {
//			for(int j=0; j<2; j++) {
//				System.out.print(gnx[i][j]);
//			}System.out.println();
//		}System.out.println();
		System.out.print(rooms);
		
	}

}


/**2차원 배열에 성별/학년 맞춰서 짜주고 
 * 해당 인덱스에 인원수가 늘어나니깐 - 이건 input값 다시 볼것 
 * 
 * ceil메소드 꿀팁
 * */
