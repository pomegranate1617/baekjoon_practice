package bronze1;

import java.util.Scanner;

public class Bj2941Re7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		
		String[] croa = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		int cnt = 0;
		StringBuilder sb = new StringBuilder(word);
		
		for(int i=0;i<croa.length;i++) {
			int index = word.indexOf(croa[i]);
			if(index != -1) {
				if(croa[i].length() ==3) {
					sb.delete(index, index+3);
					cnt++;
				}
				else {
					sb.delete(index, index+2);
					cnt++;
				}
			}
		}
		
		cnt += sb.length();
		System.out.println(cnt);
	}
}
