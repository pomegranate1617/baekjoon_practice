package bronze1;

import java.util.Scanner;

public class Bj2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		//문자를 2개씩 끊어읽고
		//d로 시작하는 경우는 길이가 2인 d-와
		//길이가 3인 dz= 여부를 판단하여 자르기
		int cnt = 0;
		for(int i=0;i<word.length()-1;i++) {
			String split = "" + word.charAt(i) + word.charAt(i+1);
			if(split.contains("d")) {
				if(split.equals("d-")) {
					i+=1;
				}
				else if(split.equals("dz")) {
					i+=2;
				}
			}
			else {
				i+=1;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
