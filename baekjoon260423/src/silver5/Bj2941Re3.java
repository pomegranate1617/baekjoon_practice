package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj2941Re3 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw){
			String input = null;
			for(int i=0;i<1;i++) {
				input = br.readLine();
			}
			
			
			String[] croa = {"c=" ,"c-","d-","lj","nj","s=","z="};
			
			
			StringBuilder sb = new StringBuilder(input);
			
			int croaCnt = 0;
			int circuit = 0;
			
			while(circuit<input.length()) {
				for(int i=0;i<croa.length;i++) {
					int index = sb.indexOf(croa[i]);
					if(index != -1) {
						if(index+1<=sb.length()) {
							sb.delete(index, index+2);
						}
						else {
							sb.delete(index,sb.length());
						}
						
						croaCnt++;
					}
				}
				if(input.contains("dz=")) {
					int index = sb.indexOf("dz=");
					if(index+1<=sb.length()) {
						sb.delete(index, index+3);
					}
					else {
						sb.delete(index,sb.length());
					}
					
					croaCnt++;
				}
				circuit++;
			}
			String newSb = sb.toString();
			croaCnt += newSb.length();
			bw.write(String.valueOf(croaCnt));
			bw.flush();	
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
