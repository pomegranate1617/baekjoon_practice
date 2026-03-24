package unrated;

import java.util.Scanner;

public class Bj408257 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//현재 시
		int b = sc.nextInt();//현재 분
		int c = sc.nextInt();//요리 시간
		
		if(a == 23) {
			if((b+c) >= 60) {
				a = ((b+c)/60)-1;
				System.out.print(a);
			}
			else {
				System.out.println(a);
			}
			System.out.println(" "+((b+c)%60));
		}
		else {
			a += ((b+c)/60);
			System.out.println(a+" "+(b+c)%60);
		}
	}
}
