package bronze2;

import java.util.Scanner;

public class Bj2675Re3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int r = sc.nextInt();
			//문제에서 r의 반복횟수와 문자열을 "공백"으로 구분하여 한줄로 표기
			//남아있는 버퍼 처리위해 작성한 nextLine()에서 
			//없는 엔터대신(엔터로 구분된게 아니라 공백으로 구분되었으니까)
			//공백과 문자열을 받아버림 => 문자열을 받기로한 다음 nextLine()에
			//들어올 문자열이 없기때문에 오류 발생
			String word = sc.next();
			String newString = "";
			
			for(int j=0;j<word.length();j++) {
				String split = word.charAt(j)+"";
				for(int k =0;k<r;k++) {
					newString += split;
				}
			}

			System.out.println(newString);
			newString = "";
		}
		sc.close();
		
	}
}
