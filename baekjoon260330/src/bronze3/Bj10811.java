package bronze3;

import java.util.Scanner;

public class Bj10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//바구니 숫자
		int m = sc.nextInt();//m회 역순으로 만들기
		int[] basket = new int[n];
		
		for(int a=0;a<n;a++) {
			basket[a] = a+1;
		}
		
		for(int a=0;a<m;a++) {
			int i = sc.nextInt();//배열인덱스i-1
			int j = sc.nextInt();//배열인덱스j-1
			int[] part = new int[j-i+1];
			int cnt = i-1;
			for(int b=0;b<part.length;b++) {
				part[b]= basket[cnt];
				cnt++;
			}
			
			for(int c=i-1;c<j;c++) {
				for(int d=part.length-1;d>=0;d--) {
					basket[c] = part[d];
				}
			}
			
		}
		for(int a=0;a<basket.length;a++) {
			System.out.println(basket[a] + " ");
		}
		
	}
}
