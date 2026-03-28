package bronze;

import java.util.Scanner;

public class Bj25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalPrice = sc.nextInt();//총 금액
		int typeNum = sc.nextInt();//물건 종류
		int reCount = 0;
		for(int i=0;i<typeNum;i++) {
			int itemPrice = sc.nextInt(); //물건의 가격
			int itemNum = sc.nextInt(); //해당 물건의 갯수
			reCount += (itemPrice * itemNum);
		}
		sc.close();
		if(totalPrice == reCount) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
