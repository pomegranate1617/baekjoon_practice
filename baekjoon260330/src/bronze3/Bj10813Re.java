package bronze3;

import java.util.Scanner;

public class Bj10813Re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//바구니 갯수
		int[] basketSet = new int[n];//바구니
		int m = sc.nextInt();//공을 바꾸는 횟수
		//각 바구니에 바구니의 번호?와 같은 숫자의 공을 넣어줌...0번바구니 1번공...
		for(int a=0;a<basketSet.length;a++) {
			basketSet[a] = a+1;
		}
		for(int k=0;k<m;k++) {
			//공을 바꿀 바구니 2개선택
			int i = sc.nextInt();
			int j = sc.nextInt();
			int saveI = basketSet[i-1];
			basketSet[i-1] = basketSet[j-1];
			basketSet[j-1] = saveI;
		}
		sc.close();
		
		for(int a=0;a<basketSet.length;a++) {
			System.out.print(basketSet[a] + " ");
		}

	}
}
