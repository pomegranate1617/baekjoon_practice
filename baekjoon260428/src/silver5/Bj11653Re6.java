package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
//재풀이 반드시 필요
public class Bj11653Re6 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw){
			int n = Integer.parseInt(br.readLine());
			int[] primeFactor = new int[n/2];
			int[] primeArr = new int[n/2];
			for(int i=2;i<n;i++) {
//				for(int j=2;)
			}
			while(true) {
				for(int i=2;i<n;i++) {
					if(n%i == 0) {
					}
				}
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
