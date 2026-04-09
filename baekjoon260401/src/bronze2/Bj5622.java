package bronze2;

import java.util.Scanner;

public class Bj5622 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().toUpperCase();
		sc.close();
		
		String[] wordArr = new String[word.length()];
		
		for(int i=0;i<word.length();i++) {
			String split = word.substring(i,i+1);
			wordArr[i] = split;
		}
		
		int result = 0;
		
		for(int j=0;j<wordArr.length;j++) {
			String alphabet = wordArr[j];
			switch(alphabet) {
			//자바11에서는 한 케이스에 여러 라벨 못붙임...수정 필요
			case "A","B","C" :
				result += 3;
				break;
			case "D","E","F" :
				result += 4;
				break;
			case "G","H","I" :
				result += 5;
				break;
			case "J","K","L" :
				result += 6;
				break;
			case "M","N","O" :
				result += 7;
				break;
			case "P","Q","R","S" :
				result += 8;
				break;
			case "T","U","V" :
				result += 9;
				break;
			case "W","X","Y","Z" :
				result += 10;
				break;
			}
				
		}
		System.out.println(result);
	
	}
}
