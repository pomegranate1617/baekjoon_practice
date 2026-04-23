package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj2941Re {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		String[] arr = null;
		try {
			String word = br.readLine();
			while(word.length()>100) {
				word = br.readLine();
			}
			 
			List<String> list = new ArrayList<>();
			String[] croa = {"c=","c-","dz","dz=","d-","lj","nj","s=","z="};
			for(int i=0;i<list.size();i++) {
				list.add(croa[i]);
			}
	
			StringTokenizer st = new StringTokenizer(word);
			while(true) {
				st.split()
			}
			
			
			
		}catch(IOException e){
			
		}
		
		
		
	}
}
