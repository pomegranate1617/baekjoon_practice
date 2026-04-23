package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj14215Re {
	public static void main(String[] args) {
		//<문제 조건>
		//3개의 막대,각 막대 '길이 줄이기'가능
		//막대길이는 양의 정수
		//넓이가 양수인 삼각형 만들기
		//삼각형 둘레 최대값구하기
		//각 변의 길이는 1이상 100이하
		//---------------------
		//입력: 
		//정수 3개(각각 1이상 100이하)
		//1회만 입력가능
		
		//출력:
		//만들 수 있는 삼각형의 세변의 길이합의 최대길이
		
		//조건:
		//가장 긴변<나머지 두 변의 합
		//위 조건이 만족 못할 시 각 변의 길이 줄이기가 가능
		
		
		
		//<문제 쪼개기>
		//입력받기
		//세 변 중 최대값 찾기
		//나머지 두 변의 길이 합 구하기
		//삼각형이 되기위한 조건 부합여부 확인
		//조건 비교
		//결과 출력
		//----------------
		//정리
		//막대 길이가 양의 정수인가.
		//각 막대의 길이가 삼각형을 만들기 위한 조건에 부합하는가.
		
		
		
		//데이터 흐름
		//a,b,c입력받음
		
		//max->세 값 중 최대
		//sum ->나머지 두 값의 합
		//if(max<sum)
		//  삼각형의 세변의 길이 합 출력
		//else
		// 각 변의 길이를 삼각형부합조건에 맞추어 길이줄이기 후 세변의 합 출력
		
		
		//변수 선언
		//세 변 a,b,c
		//배열 sideArr
		//가장 긴 변 max
		//나머지 두 값의 합 sum
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw){
			String[] sideArr = br.readLine().split(" ");
			int a = Integer.parseInt(sideArr[0]);
			int b = Integer.parseInt(sideArr[1]);
			int c = Integer.parseInt(sideArr[2]);
			
			
			int max = 0;
			for(int i=0;i<sideArr.length;i++) {
				if(max<Integer.parseInt(sideArr[i])) {
					max = Integer.parseInt(sideArr[i]);
				}
			}
			int sum = a + b + c-max;
			if(max<sum) {
				bw.write(String.valueOf(max + sum));
			}else {
				while(max>=sum) {
					max--;
				}
				bw.write(String.valueOf(max + sum));
			}
			
			bw.flush();
		}catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
		
		
	}
}
