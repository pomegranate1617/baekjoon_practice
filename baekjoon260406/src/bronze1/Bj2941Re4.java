package bronze1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Bj2941Re4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		String[] croaArr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		List<String> croaList = new LinkedList<>();
		
		for(int i=0;i<croaArr.length;i++) {
			croaList.add(croaArr[i]);
		}
		
		int cnt = 0;
		String change1 = "";
		String change2 = "";
		String change3 = "";
		StringBuilder sb = new StringBuilder(word);
		
		int i = 0;
		while(true) {
			//3글자
			if(i+3<=word.length()) {
				String split3 = word.substring(i,i+3);
				if(croaList.contains(split3)) {
					cnt++;
					change1 = sb.delete(i, i+3).toString();
						             
				}
			}
			//2글자
			if(i+2<=change1.length()) {
				String split2 = change1.substring(i,i+2);
				if(croaList.contains(croaList)) {
					cnt++;
					change2 = sb.delete(i, i+2).toString();
				}
			}
			//1글자
			if(i+1<=change2.length()) {
				String split1 = change2.substring(i,i+1);
				if(croaList.contains(split1)) {
					cnt++;
					change3 = sb.delete(i, i+1).toString();
				}
				else {
					cnt++;
				}
			}
			if(change3.equals("")) {
				cnt++;
				break;
			}
		}
		System.out.println(cnt);
		
		
		
		
	}
}
