package bronze;

import java.util.Scanner;

public class Bj2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		int[] diceArr = {dice1,dice2,dice3};
		boolean[] check = new boolean[3];
		int[] copyArr = diceArr;
		int count=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i != j) {
					boolean compare;
					if(copyArr != diceArr) {
						compare = false;
					}
					else {
						compare = true;
					}
					check[count]=compare;
				}
			}
		}
		
		int trueCnt = 0;
		if(trueCnt>=2) {
			System.out.println(10000+dice1*1000);
		}
		else if(trueCnt==1) {
			int num=0;
			for(int i =0;i<3;i++) {
				if(check[i] == true) {
					num = diceArr[i];
					break;
				}
			}
			System.out.println(1000+num*100);
		}
		else {
			int max =0;
			for(int i=0;i<3;i++) {
				if(max<diceArr[i]) {
					max = diceArr[i];
				}
			}
			System.out.println(max*100);
		}
		
	}
}
