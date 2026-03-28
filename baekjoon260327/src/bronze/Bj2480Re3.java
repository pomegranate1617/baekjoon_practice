package bronze;

import java.util.Scanner;

public class Bj2480Re3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		sc.close();
		
		int cnt = 0;//일치하는 갯수
		int correct = 0;//일치하는 수가 무엇인지..
		
		if(dice1 == dice2) {
			correct = dice1;
			cnt++;
		}
		if(dice1 == dice3) {
			correct = dice1;
			cnt++;
		}
		if(dice2 == dice3) {
			correct = dice3;
			cnt++;
		}
		
		if(cnt >= 2) {
			System.out.println(10000+correct*1000);
		}
		else if(cnt == 1) {
			System.out.println(1000 +correct*100);
		}
		else {
			int max= 0;
			int[] diceArr = {dice1,dice2,dice3};
			for(int i = 0;i < diceArr.length;i++) {
				if(max<diceArr[i]) {
					max = diceArr[i];
				}
			}
			System.out.println(max*100);
		}
	}
}
