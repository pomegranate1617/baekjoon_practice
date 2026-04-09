package bronze2;

import java.util.Scanner;

public class Bj11720Re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String num = sc.nextLine();
		sc.close();
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum += Integer.parseInt(num.substring(i,i+1));
		}
		System.out.println(sum);
		
		
		
	}
}
