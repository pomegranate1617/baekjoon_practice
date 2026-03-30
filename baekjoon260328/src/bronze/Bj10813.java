package bronze;

import java.util.Scanner;

public class Bj10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();//m번 바꿀 계획
		int[] basket = new int[n+1];//바구니 번호랑 배열 번호 일치시키기
		
		for(int k=1;k<basket.length;k++) {
			basket[k] = k;
		}
		
		for(int h=0;h<m;h++) {
			
			int i = sc.nextInt();
			int j = sc.nextInt();
			int previous1 = basket[i];
			int previous2 = basket[j];
			basket[i] = previous2;//뭔가 객체 주소를 참조하고 있는거 같음...답이 이상해...근데 기본타입이 어떻게 참조가 되는거지;;
			basket[j] = previous1;
		}
		sc.close();
		for(int l=1;l<basket.length;l++) {
			System.out.print(basket[l] + " ");
		}
	}
}
