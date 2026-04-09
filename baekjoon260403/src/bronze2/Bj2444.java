package bronze2;

import java.util.Scanner;

public class Bj2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int top = n;
		int bottom = n-1;
		int middle = (int)Math.round((double)1+2*(n-1));//가운데별이 놓일 위치 
		String star = "*";
		
		for(int i=1;i<=top;i++) {
			for(int j=1;j<middle;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<1+(i*2);j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
//		for(int i=bottom;i>0;i--) {
//			for(int j=middle;j>0;j--) {
//				System.out.println();
//			}
			
//		}
	}
}
