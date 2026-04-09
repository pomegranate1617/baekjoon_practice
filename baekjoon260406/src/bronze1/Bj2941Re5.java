package bronze1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Bj2941Re5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		String[] croaArr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		List<String> croaList = new LinkedList<>();
		
		for(int i=0;i<croaArr.length;i++) {
			croaList.add(croaArr[i]);
		}
		
		StringBuilder sb = new StringBuilder(word);
		
		int i = 0;
		int croaCnt = 0;
		
		while(true) {
			try {
				//3글자
				 String change3 = sb.substring(i,i+3);
				 if(croaList.contains(change3)) {
					 croaCnt++; 
					 sb.delete(i, i+3);
				 }
			}catch(Exception e1) {
				try {
					//2글자
					 String change2 = sb.substring(i,i+2);
					 if(croaList.contains(change2)) {
						 croaCnt++;
						 sb.delete(i, i+2);
					 }
				}catch(Exception e2) {
					//1글자
					 String change1 = sb.substring(i,i+1);
					 if(croaList.contains(change1)) {
						 croaCnt++;
						 sb.delete(i, i+1);
					 }
				}
				if(sb.length()==0) {
					//StringBuilder는 equals로 비교 못함
					break;
				}
			}
		}
		System.out.println(croaCnt);
	}
}
