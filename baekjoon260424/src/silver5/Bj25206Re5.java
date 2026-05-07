package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bj25206Re5 {
	public static void main(String[] args) {
		//조건
		//과목명 길이는 1이상 50이하
		//적어도 한 과목은 p가 아님이 보장..즉 p/f과목에서는 모두 p일 경우는 없다.
		//(모두 f는 가능)
		//입력으로 주어지는 모든 과목명이 다를 것
		//과목 학점은 1.0,2.0,3.0,4.0 중 하나
		//등급도 범위가 정해져 있음.
		
		//문제쪼개기
		//과목의 학점*(치훈이가 받은 과목평점)/20과목의 학점의 총합을 출력
		//p/f과목의 f와 p/f과목이 아닌 다른 과목의 f평점을 어떻게 구분할 것인가...<<필요x
		//p인 과목은 계산에서 제외
		
		//사용할 변수명
		//과목명 변수 course
		//해당 과목의 학점 credit
		//치훈이가 받은 과목평점 grade
		//받은 과목평점의 총합 total<<추가
		//과목수 courseCnt<<추가
		//학점의 총합 gradeTotal<<c추가
		//등급이 p가 아닌 과목의 수 notPCnt<<추가
		
		//사용할 자료구조
		//배열을 사용해 학점을 등록
		//set을 사용해 과목명을 등록(중복방지)
		//Map을 사용해 등급과 그에 따른 과목 평점을 key,value로 각각 매핑
		
		//데이터 흐름
		//input에 한 줄 입력됨
		//파싱으로 과목명과 학점 받은 과목 평점으로 쪼개짐
		//학점과 과목평점이 계산되어 출력
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		try(br){
			
			Map<String,Float> map = new HashMap<>();
			map.put("A+", 4.5f);
			map.put("A0", 4.0f);
			map.put("B+", 3.5f);
			map.put("B0", 3.0f);
			map.put("C+", 2.5f);
			map.put("C0", 2.0f);
			map.put("D+", 1.5f);
			map.put("D0", 1.0f);
			map.put("F", 0.0f);
			map.put("P", null);
//			float[] creditArr = {1.0f,2.0f,3.0f,4.0f};
			
			float total = 0.0f;
			float gradeTotal = 0.0f;
			int notPCnt = 0;
			int pCnt = 0;
			
			Set<String> courseSet = new HashSet<>();
			
			while(courseSet.size()<20) {
				String[] input = br.readLine().split(" ");
				
				String course = input[0];
				if(!courseSet.contains(course) &&course.length()<=50 &&course.length()>=1) {
					courseSet.add(course);
				}else {
					continue;
				}
				
				float credit = Float.parseFloat(input[1]);
				
				String grade = input[2];
				if(map.containsKey(grade)) {
					if(grade.equals("P")) {
						pCnt++;
					}else {
						total += (credit*map.get(grade));
						gradeTotal += credit;
						notPCnt++;
					}	
				}else {
					courseSet.remove(course);
					continue;
				}
				if(courseSet.size() ==20 && notPCnt<1) {
					courseSet.clear();
				}
			}
			
			float result = total/gradeTotal;
			if(Float.isNaN(result)|| Float.isInfinite(result)) {
				System.out.printf("%8.6f",0);
			}else {
				System.out.printf("%8.6f",result);
			}	
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
