package bronze1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Bj1157 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().toUpperCase();
		sc.close();
		
		Map<String,Integer> count = new HashMap<>();
		
		for(int i=0;i<word.length();i++) {
			String split = word.charAt(i) + "";
			if(!count.containsKey(split)) {
				count.put(split, 1);
			}else {
				count.put(split, count.get(split)+1);
			}
			
		}
		
		int max = -1;
		String maxChar = "";
		int prevMax = -1;
		boolean duplication = false;
		
		Set<Entry<String,Integer>> entrySet = count.entrySet();
		Iterator<Entry<String,Integer>> entryIter = entrySet.iterator();
		
		while(entryIter.hasNext()) {
			
			Entry<String,Integer> entry = entryIter.next();
			String key = entry.getKey();
			int value = entry.getValue();
			
			if(max<value) {
				maxChar = key;
				max = value;
				
			}
			else if(max == value){
				duplication = true;
				prevMax = value;
			}
			
		}
		
		if(max != prevMax) {
			System.out.println(maxChar);
		}
		else if(duplication ==true){
			System.out.println("?");
		}
	}
}
