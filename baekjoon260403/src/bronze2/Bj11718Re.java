package bronze2;

import java.util.Scanner;

public class Bj11718Re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//100줄 이내로 입력해야 되는데 
		//별다른 입력없이 원하는 횟수만큼 입력하고 바로 종료되는..
		int cnt = 0;
		long start = 0;
		long end = 0;
		label:while(cnt<100) {
			if(cnt >=1) {
				end = System.currentTimeMillis();
				if(end - start>10000) {
					break label;
				}
			}
			String word = sc.nextLine();
			if(word.length()<=100 && word.length()>0) {
				System.out.println(word);
				cnt++;
			}
			start = System.currentTimeMillis();
		}
		sc.close();
	}
	
}
