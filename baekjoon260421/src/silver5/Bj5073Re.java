package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj5073Re {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw){
			while(true) {
				String input = br.readLine();
				if(input == null) {
					break;
				}
				StringTokenizer st = new StringTokenizer(input," ");
				int[] side = new int[2];
				int split = -1;
				int cnt = 0;
				int max = -1;
				while(st.hasMoreTokens()) {
					split = Integer.parseInt(st.nextToken());
					if(split<100 && split<=0) {
						break;
					}
					if(max<split) {
						if(max != -1) {
							side[cnt] = max;
							max = split;
						}
						else {
							side[cnt] = split;
						}
					}
				}
				if(split>1000 && split<=0) {
					continue;
				}
				int shortSum = 0;
				for(int i=0;i<side.length;i++) {
					shortSum += side[i];
				}
				int equalsCnt = 0;
				if(shortSum<max) {
					if(max == side[0]) {
						equalsCnt++;
					}
					if(max == side[1]) {
						equalsCnt++;
					}
					if(side[0]==side[1]) {
						equalsCnt++;
					}
					
					
					if(equalsCnt>=2) {
						bw.write("Equilateral\n");
					}
					else if(equalsCnt ==1) {
						bw.write("Isosceles\n");
					}
					else {
						bw.write("Scalene\n");
					}
				}else {
					bw.write("invalid\n");
				}
				
			}
			bw.flush();	
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
