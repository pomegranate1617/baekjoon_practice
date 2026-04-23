package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj5073 {
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
				
				int[] side = new int[3];
				int maxSide = 0;
				
				int cnt = 0;
				
				while(st.hasMoreTokens()) {
					int sideLen = Integer.parseInt(st.nextToken());
					if(maxSide<sideLen) {
						maxSide = sideLen;
					}
					side[cnt] = sideLen;
					cnt++;
	
				}
				
				int shortSum = side[0] + side[1];
				int equalsCnt = 0;
				if(shortSum>maxSide) {
					if(side[0] == side[1]) {
						equalsCnt++;
					}
					if(side[0] == side[2]) {
						equalsCnt++;
					}
					if(side[1] == side[2]) {
						equalsCnt++;
					}
					
					if(equalsCnt>=2) {
						bw.write("Equilateral\n");
					}
					else if(equalsCnt==1) {
						bw.write("Isosceles\n");
					}
					else {
						bw.write("Scalene\n");
					}
				}else {
					bw.write("Invalid\n");
				}
				
			}
			bw.flush();
		}catch(IOException e){
			System.out.println(e.getStackTrace());
		}
	}
}
