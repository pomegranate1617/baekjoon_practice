package bronze1;

import java.util.Scanner;

public class Bj25206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = 20;//전체 과목 갯수
		double sum = 0; //(인정학점*과목평점)의 전체 합계
		double scoreSum = 0;
		for(int i=0;i<20;i++) {
			
			String subject = sc.next();//과목명
			double credit = sc.nextDouble();//인정학점
			String grade = sc.next();//과목평점
			
			//과목명 인정학점 과목평점
			double change = -1.0;
			if(!grade.equals("P")) {
				switch(grade) {
				case "A+" :
					change = 4.5;
					break;
				case "A0" :
					change = 4.0;
					break;
				case "B+" :
					change = 3.5;
					break;
				case "B0" :
					change = 3.0;
					break;
				case "C+" :
					change = 2.5;
					break;
				case "C0" :
					change = 2.0;
					break;
				case "D+" :
					change = 1.5;
					break;
				case "D0" :
					change = 1.0;
					break;
				case "F" :
					change = 0.0;
					break;
				}
			sum += credit*change;
			scoreSum += change;
			}
			else {
				number -= 1;
			}
			
			
		}
		sc.close();
		double result = sum/scoreSum;
		System.out.println(result);
	
	}
}
