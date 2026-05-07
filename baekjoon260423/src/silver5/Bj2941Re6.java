package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj2941Re6 {
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
			
			String[] inputSplit = new String[input.length()]; 
			for(int i=0;i<input.length();i++) {
				inputSplit[i] = input.charAt(i) + "";
			}
			
			int croaCnt = 0;
			String[] splitStd = {"c","d","l","n","s","z"};
			for(int i=0;i<input.length();i++) {
				for(int j=0;j<splitStd.length;j++) {
					if(inputSplit[i].equals(splitStd[j])) {
						if(i+1<=inputSplit.length) {
							if(inputSplit[i+1].equals("=")) {
								i++;
								croaCnt++;
							}
							else {
								if(i+2<=inputSplit.length) {
									String replace = inputSplit[i] + inputSplit[i+1]+ inputSplit[i+2];
									if(replace.equals("dz=")) {
										i += 2;
										croaCnt++;
									}
								}
								else {
									croaCnt++;
								}
							}
						}
						else {
							croaCnt++;
						}
						
					}else {
						croaCnt++;
					}
					
				}
			}
			bw.write(croaCnt+"");
			bw.flush();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
