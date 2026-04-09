package bronze1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		List<String> list = new ArrayList<>();
		
		boolean group = true;
		int groupCnt = 0;
		int start = 0;
		
		while(start<n) {
			String word = sc.nextLine();
			String prev = "";
			for(int i=0;i<word.length();i++) {
				String split = word.charAt(i) + "";
				if(!list.contains(split)) {
					list.add(split);
					prev = split;
				}
				else {
					if(i<=0 || !prev.equals(split)) {
						group = false;
						break;
					}
					
				}
			}
			if(group == true) {
				groupCnt++;
			}
			else {
				group = true;
			}
			start++;
			list.clear();
		}
		sc.close();
		System.out.println(groupCnt);
	}
}
