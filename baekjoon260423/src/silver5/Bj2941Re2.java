package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj2941Re2 {
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
			
			
			String clearStd = "";
			for(int i=0;i<input.length();i++) {
				clearStd += "0";
			}
			

			int croaCnt = 0;
			while(true) {
				for(int i=0;i<croa.length;i++) {
					int index = input.indexOf(croa[i]);
					if(index != -1) {
						input.replace(croa[i], "00");
						croaCnt++;
					}
				}
				if(input.contains("dz=")) {
					input.replace("dz=", "000");
					croaCnt++;
				}
				if(input.equals(clearStd)) {
					break;
				}
			}
			bw.write(croaCnt);
			bw.flush();	
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
