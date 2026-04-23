package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj3009Re {
	public static void main(String[] args) {
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		
		try (br;bw){
			Set<Integer> xSet = new HashSet<>();
			Set<Integer> ySet = new HashSet<>();
			
			int resultX = -1;
			int resultY = -1;
			
			int i = 0;
			while(i<3) {
				String input = br.readLine();
				
				StringTokenizer st = new StringTokenizer(input," ");
				
				int cnt = 1;
				int x = -1;
				int y = -1;
				while(st.hasMoreTokens()) {
					if(cnt == 1) {
						x = Integer.parseInt(st.nextToken());
					}
					else {
						y = Integer.parseInt(st.nextToken());
					}
					cnt++;
					
				}
				
				if(!xSet.contains(x) && i!=0) {
					resultX = x;
					xSet.add(x);
				}
				
				if(!ySet.contains(y) && i!=0) {
					resultY = y;
					xSet.add(y);
				}
				
				
				
				i++;
			}
			bw.write(resultX + " " + resultY);
			bw.flush();
	
		}catch(IOException e) {
			
		}
		
	}
	
}


