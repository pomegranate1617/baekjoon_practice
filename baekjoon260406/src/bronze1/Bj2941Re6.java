package bronze1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj2941Re6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		
		String[] croa = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		List<String> croaList = new ArrayList<>();
		for(int i=0;i<croa.length;i++) {
			croaList.add(croa[i]);
		}
		
		int cnt = 0;
		List<String> list = new ArrayList<>();
		String[] arr = word.split("=|-");
		for(int i=0;i<arr.length;i++) {
			if(croaList.contains(arr[i])) {
				list.add(arr[i]);
			}
			else {
				
			}
		}
		
		
	}
}
