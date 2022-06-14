package package03;

import java.util.StringTokenizer;

public class datavalueExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		String tmpStr = "hong 용산구 10.5 20.5";
		//기본적으로 토근(구분자)는 공백으로 설정되어 있다
		//토큰은 , 로 설정된다 데이터를 분리할때 ,가 기준
		//StringTokenizer parse = new StringTokenizer(tmpStr, ",");
		
		StringTokenizer parse = new StringTokenizer(tmpStr);
		
		String name;
		String address;
		double math;
		double english;
		double total;
		double avg;
		
		name = parse.nextToken();
		//parese는 hong -- 문자열에서 hong을 가리킨다
		//hong문자열을 name 에 저장한 후에 parse는 용산구 문자열을 가리킨다
		address = parse.nextToken();
		//address에 용산구 문자열을 저장한 후에 parse는 10.5를 가리킨다
		math = Double.valueOf(parse.nextToken()).doubleValue();
		//1. parse.nextToken()는 10.5f를 뽑아내고 pares는 20.5를 가리킨다
		//2.Double.valueOf(parse.nextToken())은 "20.5"를 Wrapper 형 실수형으로 변환
		//3. doubleValue();는 기본실수형(double)으로 변환
		//english = 20.5가 저장 
		
		english = Double.valueOf(parse.nextToken()).doubleValue();
		total = math + english;
		avg = total/2.0;
		System.out.println(name + "\t" + address + "\t" + math + "\t"
		 + english + "\t" + total + "\t" +avg);
		
	
	
	}

}
