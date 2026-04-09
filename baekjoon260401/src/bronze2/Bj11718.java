package bronze2;

import java.util.Scanner;

public class Bj11718 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<100;i++) {
			long start = System.currentTimeMillis();
			String sentence = sc.nextLine();
			long end = System.currentTimeMillis();
			if(end-start>5000) {
				break;
			}
			System.out.println(sentence);
			
		}
	}
}
