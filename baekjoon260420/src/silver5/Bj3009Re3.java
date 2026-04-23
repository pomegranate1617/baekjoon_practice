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
import java.util.Set;
import java.util.StringTokenizer;

public class Bj3009Re3 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw){
			String[] xArr = new String[3];
			String[] yArr = new String[3];
			for(int i=0;i<3;i++) {
				String input = br.readLine();
				
				StringTokenizer  st = new StringTokenizer(input," ");
				
				int cnt = 0;
				while(st.hasMoreTokens()) {
					if(cnt == 0) {
						xArr[i] = st.nextToken();
						cnt++;
					}
					else {
						yArr[i] = st.nextToken();
					}
				}
				
			}
			
			Map<String,Integer> xMap = new HashMap<>();
			Map<String,Integer> yMap = new HashMap<>();
			
			for(int j=0;j<xArr.length;j++) {
				int cnt1 = 1;
				if(xMap.containsKey(xArr[j])) {
					xMap.put(xArr[j], cnt1++);
				}else {
					xMap.put(xArr[j], cnt1);
				}
				
				int cnt2 = 1;
				if(yMap.containsKey(yArr[j])) {
					yMap.put(yArr[j], cnt2++);
				}else {
					yMap.put(yArr[j], cnt2);
				}
			}
			String resultX = null;
			String resultY = null;
			Set<Map.Entry<String,Integer>> setXEntry  = xMap.entrySet();
			for(Map.Entry<String,Integer> entry : setXEntry) {
				if(entry.getValue()%2 == 1) {
					resultX = entry.getKey();
				}
			}
			
			Set<Map.Entry<String,Integer>> setYEntry  = yMap.entrySet();
			for(Map.Entry<String,Integer> entry : setYEntry) {
				if(entry.getValue()%2 == 1) {
					resultY = entry.getKey();
				}
			}
			bw.write(resultX + " " + resultY);
			bw.flush();
		}catch(IOException e) {
			
		}
	
	}
}	
