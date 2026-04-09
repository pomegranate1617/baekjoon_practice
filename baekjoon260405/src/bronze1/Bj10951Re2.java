package bronze1;

import java.util.Scanner;

public class Bj10951Re2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			while(true) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				if((a>0 && a<10) && (b>0 && b<10)) {
					System.out.println(a+b);
				}
			}
		}catch(Exception e) {
			sc.close();
		}
	}
}
