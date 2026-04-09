package bronze2;

import java.util.Scanner;

public class Bj5622Re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().toUpperCase();
		sc.close();
		
		while(!(word.length()>=2) || !(word.length()<=15)) {
			System.out.println("길이 2이상 15미만으로 재입력");
			word = sc.nextLine().toUpperCase();
		}
		
		//숫자1걸면 2초 그 이후 1초씩 증가
		//a,b,c는 2초 def는 3초 식으로 증가
		//대문자 A는 아스키 코드로 65
		int time = 0;
		for(int i=0;i<word.length();i++) {
			int split = word.charAt(i);
//			int num = -1;
//			boolean pass = false;//switch에서 값 리턴 여부 파악
			
			if(split<80) {
				switch((split%65)/3) {
				//각 케이스가 누를 전화번호 숫자를 리턴
				//=>처음부터 걸린 시간을 리턴하도록 변경
				case 0 :
					time += 3;
					break;
				case 1 :
					time += 4;
					break;
				case 2 :
					time += 5;
					break;
				case 3 :
					time += 6;
					break;
				case 4 :
					time += 7;
					break;
//				default :
//					pass = true;
				}
			}
			
			
			if(split>=80) {
//				pass = false;//pass초기화
				if(split>=80 && split<84) {
					time += 8;
				}
				else if(split>=84 && split<87) {
					time += 9;
				}
				else if(split>=87 && split<=90) {
					time += 10;
				}
			}

			
		}
		System.out.println(time);
		
	}
}
