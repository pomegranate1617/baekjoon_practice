package bronze2;

import java.util.Scanner;

public class Bj2675Re2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int r = sc.nextInt();
			sc.nextLine();
			String word = sc.nextLine();
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
