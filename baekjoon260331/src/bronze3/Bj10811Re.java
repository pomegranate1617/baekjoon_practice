package bronze3;

import java.util.Scanner;

public class Bj10811Re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//바구니 갯수
		int m = sc.nextInt();//반복 횟수m
		int[] basket = new int[n+1];
		
		for(int a =1;a<basket.length;a++) {
			basket[a] = a; 
		}
		
		for(int a=0;a<m;a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int[] part = new int[j-i+1];
			for(int b=0,c=i;b<part.length && c<=j;b++,c++) {
				part[b] = basket[c];
			}
			
			int cnt = part.length-1;
			for(int b=i;b<=j;b++) {
				basket[b] = part[cnt];
				cnt--;
			}
		}
		sc.close();
		for(int a=1;a<basket.length;a++) {
			System.out.print(basket[a] + " ");
		}
		
	}
}
