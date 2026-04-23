package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj14215 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw) {
			boolean rangeCheck = true;
			int cnt = 0;
			int max = 0;
			int[] side = new int[2];
			while(true) {
				String input = br.readLine();
				if(input == null) {
					break;
				}
				StringTokenizer st = new StringTokenizer(input," ");
				while(st.hasMoreTokens()) {
					int split = Integer.parseInt(st.nextToken());
					if(split<1 && split>100) {
						rangeCheck = false;
						break;
					}
					if(!rangeCheck) {
						continue;
					}
					side[cnt] = split;
					cnt++;
					if(max<split && max !=0) {
						side[cnt] = max;
						max = split;
					}else {
						side[cnt] = split;
					}
					cnt++;
				
					
				}
			}
			int shortSum = side[0] + side[1];
			if(shortSum>max) {
				bw.write(String.valueOf(shortSum + max));
			}else {
				while(shortSum<=max) {
					max--;
				}
				bw.write(String.valueOf(shortSum+max));
			}
			
			
		}catch(IOException e) {
			
		}
	}
}
