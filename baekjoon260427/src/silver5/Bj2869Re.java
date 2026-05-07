package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj2869Re {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		//문제조건
		//v미터인 나무막대 올라감
		//낮a미터 올라가고 밤b미터 떨어짐
		//올라가는데 며칠?
		
		try(br;bw){
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int v = Integer.parseInt(input[2]);
			
			int day = 0;
			int heigth = 0;
			while(true) {
				day++;
				heigth += a;
				if(heigth>=v) {
					break;
				}
				heigth -= b;
				if(heigth<0) {
					heigth = 0;
				}
			}
			bw.write(day + "");
			bw.flush();
		}catch(IOException e) {
			
		}
	}
}
