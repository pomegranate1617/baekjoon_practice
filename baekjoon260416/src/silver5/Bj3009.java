package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Bj3009 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		Map<Integer,Integer> map = new HashMap<>();
		try(br;bw){
			int i = 0;
			int minColumn = -1;
//			int 
			while(i<3) {
				String input = br.readLine();
				
				String[] arr = input.split(" ");
				
				int row = Integer.parseInt(arr[0]);//x
				int column = Integer.parseInt(arr[1]);//y
				if(minColumn == -1) {
					minColumn = column;
				}else {
					if(minColumn>column) {
						minColumn = column;
					}
				}
				
				if(map.containsKey(arr[0])) {
					int prevValue = map.put(row,column);
					int height = Math.abs(prevValue-map.get(arr[0]));
					map.remove(arr[0]);
				}else {
//					map.put(arr[0],arr[1]);
				}
				i++;
			}
			
			
			
			
			
		}catch(IOException e) {
			
		}
		
	}
}
