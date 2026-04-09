package bronze1;

import java.util.Scanner;

public class Bj11718 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int cnt = 0;
			while(cnt<=100) {
				String sentence = sc.nextLine();
				if(sentence.length()<=100) {
					cnt++;
					System.out.println(sentence);
				}
			}
		}catch(Exception e) {
			sc.close();
		}
	}
}
