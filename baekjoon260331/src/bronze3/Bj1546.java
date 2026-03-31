package bronze3;

import java.util.Scanner;

public class Bj1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//시험 본 과목 개수
		int[] scoreArr = new int[n];
		
		for(int i=0;i<n;i++) {
			int score = sc.nextInt();
			scoreArr[i] = score;
		}
		sc.close();
		
		int m = scoreArr[0];//최대값
		for(int i=0;i<scoreArr.length;i++) {
			if(m<scoreArr[i]) {
				m = scoreArr[i];
			}
		}
		
		float total = 0;
		for(int i=0;i<scoreArr.length;i++) {
			//부동소수점 연산 시 오차에 주의
			float reScore = (float)scoreArr[i]/m*100;//float 출력 가능성 주의
			total += reScore;
		}
		System.out.println(total/n);
		
	}
}
