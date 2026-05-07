package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj2941Re5 {
	public static void main(String[] args) {
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		String[] croa = {"c=" ,"c-","d-","lj","nj","s=","z=","dz="};
		
		try(br;bw){
			String input = "";
			do {
				input = br.readLine();
			}while(input.length()>100);
			
			int croaCnt = 0;
			while(true){
				for(int i=0;i<croa.length;i++) {
					int index = input.indexOf(croa[i]);
					if(index != -1) {
//						input.rep
					}
				}
			}
		}catch(IOException e) {
			
		}
		
		
	}
}
