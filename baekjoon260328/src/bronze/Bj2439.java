package bronze;

import java.util.Scanner;

public class Bj2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String star = "*";
		for(int i=1;i<=n;i++) {
			int emptyNum = n - i;
			for(int k =1;k<=emptyNum;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(star);
				if(j == i) {
					System.out.println();
				}
			}
				
			
		}
	}
}
