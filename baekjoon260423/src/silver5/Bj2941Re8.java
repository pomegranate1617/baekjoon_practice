package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj2941Re8 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw){
			String input = null;
			do {
				input = br.readLine();
			}while(input.length()>100);
			
			String[] croa = {"c=" ,"c-","d-","dz=","lj","nj","s=","z="};
			int cnt = 0;
			int end = input.length();
			String replaceInput = input;
			while(cnt<end) {
				for(int i=0;i<croa.length;i++) {
					if(input.contains(croa[i])) {
						replaceInput = replaceInput.replace(croa[i],"!");
					}
				}
				cnt++;
			}
			bw.write(replaceInput.length() + "");
			bw.flush();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
