package bronze;

import java.util.Scanner;

public class Bj2483 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String star = "*";
		for(int i=1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(star);
				if(j == i) {
					System.out.println();
				}
			}
		}
		
	}
}
