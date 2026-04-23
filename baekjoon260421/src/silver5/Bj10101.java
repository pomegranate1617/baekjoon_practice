package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj10101 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		int[] angle = new int[3];
		int angleSum = 0;
		try(br;bw) {
			
			for(int i=0;i<3;i++) {
				String input = br.readLine();
				angle[i] = Integer.parseInt(input);
				angleSum += angle[i];
			}
			
			int equalsCnt = 0;
			
			if(angleSum != 180) {
				bw.write("Error");
			}
			else {
				if(angle[0] == angle[1]) {
					equalsCnt++;
				}
				if(angle[0] == angle[2]) {
					equalsCnt++;
				}
				if(angle[1] == angle[2]) {
					equalsCnt++;
				}
				
				
				if(equalsCnt>=2) {
					bw.write("Equilateral");
				}
				else if(equalsCnt == 1) {
					bw.write("Isosceles");
				}
				else {
					bw.write("Scalene");
				}
			}

			bw.flush();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
