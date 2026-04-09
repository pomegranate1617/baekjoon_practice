package bronze1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj2941Re2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		//d로 시작하는 경우는 길이가 2인 d-와
		//길이가 3인 dz= 를 구분하여 자르기
		//단어에는 일반 알파벳과 동일한 모양의 크로아티아 알파벳도 포함됨
		
		String[] croa = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String[] startCroa = {"c","d","l","n","s","z"};
		List<String> startCroaList = new ArrayList<>();
		List<String> croaList = new ArrayList<>();
		
		for(int i=0;i<startCroa.length;i++) {
			startCroaList.add(startCroa[i]);
		}
		
		for(int i=0;i<croa.length;i++) {
			croaList.add(croa[i]);
		}
		
		
		int cnt = 0;
		for(int i=0;i<word.length();i++) {
			String split = word.substring(i,i+1);
			
			if(startCroaList.contains(split)) {
				
				if(split.equals("d")) {
					if(i+2<=word.length()) {
						split += word.substring(i+1,i+2);
						
						if(split.equals("d-")) {
							cnt++;
							i++;
						}
						else if(split.equals("dz") && i+3<=word.length()){
							split += (word.substring(i+1,i+2) + word.substring(i+2,i+3));
							if(split.equals("dz=")) {
								cnt++;
								i += 2;
							}
						}
						else {
							cnt++;
						}
					}
					
					
				}
				else {
					if(i+2<=word.length()) {
						
						split += word.substring(i+1,i+2);
						
						if(croaList.contains(split)) {
							cnt++;
							i++;
						}
						else {
							cnt++;
						}
					}
					
				}
			}
			else {
				cnt++;
			}
			
		}
		System.out.println(cnt);
	}
}
