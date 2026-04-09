package bronze1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj2941Re3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		List<String> list = arrToList(arr);
		System.out.println(croaCheck(word,list));
		
		
	}
	
	private static List<String> arrToList(String[] arr) {
		List<String> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		return list;
	}
	private static int croaCheck(String word,List<String> list) {
		int croaCnt = 0;
		for(int i=0;i<word.length();i++) {
			
			if(i+2<word.length()) {
				//문자열을 2글자씩 자른다.
				String split1 = word.substring(i,i+2);
				//두글자로 자른 문자열이 list에 있는지 확인
				boolean contain1 = list.contains(split1);
				if(contain1) {
					croaCnt++;
					i++;	
				}
				else {

					if(i+3<=word.length()) {
						//예외:dz=의 경우는 3글자
						String split2 = word.substring(i,i+3);
						boolean contain2=list.contains(split2);
						if(contain2) {
							croaCnt++;
							i += 2;
						}
						else {
							croaCnt++;
						}
					}
					else {
						//없으면 한글자인 크로아티아 알파벳 =>문자 갯수에 포함
						croaCnt++;
					}
				}

			}
			else {
				//i+2이 문자열의 길이보다 클 때 =>마지막이 1글자~3글자
				if(word.length() >= 2) {
					String split3 = "" + word.charAt(i) + word.charAt(i+1);
					if(list.contains(split3)) {
						croaCnt++;
						i++;
					}
					else {
						//한글자
						croaCnt++;
					}
					
				}
			}
				
		}
		return croaCnt;
	}
}
