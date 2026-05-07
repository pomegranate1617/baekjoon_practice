package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj2941Re {
	public static void main(String[] args) {
		//문제 조건
		//2~3개의 문자로 하나의 알파벳표현
		//최대100글자 단어
		//알파벳소문자와 -,=로만 이루어짐
		
		
		//문제 쪼개기
		//쪼갠 단어들을 저장할 배열만들기(길이100)
		//1회 입력
		//크로아티아 알파벳은 =,-가 뒤에 붙거나 -j의 형태로 끝나는 2~3문자의 모음
		//-----
		//입력: 단어 한 줄
		//출력:단어에 포함된 크로아티아 알파벳의 개수
		
		//데이터 흐름
		//input으로 단어 입력받기
		//단어를 -,=,j기준으로 쪼개어 배열에 저장
		//배열에 저장된 문자들이 크로아티아알파벳과 동일한지 여부 파악후 재쪼개기
		//재쪼개기한 문자들을 다시 배열에 저장
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
			
			String[] oneSplit = new String[input.length()];
			for(int i=0;i<input.length();i++) {
				oneSplit[i] = input.substring(i,i+1);
			}
			
			int prevIndex = -1;
			String[] sumChar = new String[input.length()];
			int cnt = 0;
			for(int i=prevIndex+1;i<oneSplit.length;i++) {
				if(oneSplit[i].equals("=") |oneSplit[i].equals("-") |oneSplit[i].equals("j") ) {
					String combine = input.substring(prevIndex+1,i+1);
					sumChar[cnt] = combine;
					prevIndex = i;
					cnt++;
				}
				
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
