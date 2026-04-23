package silver5;

import java.util.Scanner;

public class Bj27323 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		while(!(a>=1 && a<=100)) {
			a = sc.nextInt();
			
		}
		while(!(b>=1 && b<=100)) {
			b = sc.nextInt();
		}
		sc.close();
		System.out.println(a*b);
	}
}
