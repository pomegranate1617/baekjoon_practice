package bronze2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bj2908Re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(num);
		//두번째 인자 생략 시 공백을 구분자로
		
		int max = 0;
		while(st.hasMoreTokens()) {
			
			String number = st.nextToken();
			String[] splitNum = new String[number.length()];
			
			int cnt = 0;
			String trans = "";
			
			for(int i =splitNum.length-1;i>=0;i--) {
				splitNum[cnt] = number.substring(i,i+1);
				cnt++;
				//cnt++안하면  max대입시 null값 나와서 예외뜸..
			}
			
			for(int j=0;j<number.length();j++) {
				trans += splitNum[j];
			}
			if(max == 0 || max <Integer.parseInt(trans)) {
				max = Integer.parseInt(trans);
			}
			
		}
		System.out.println(max);
		
	}
}
