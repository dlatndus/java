package package01;

public class SubstringExam {
	public static void main(String[] args) {
		String strData1 = "I Love You";
		String strData3;
		
		//strData1이 가리키는 문자역의 7번째 이후의 문자열 끝까지를 반환
		//문자열의 위치는 0부터 출발
		strData3 = strData1.substring(7);
		System.out.println("strData1.substring(7)==>"+strData3);
		
		//2번째 문자부터 시작해서 5-1(맨끝에꺼 -1)까지 문자열을 반환한다
		//2~4까지 문자열
		strData3 = strData1.substring(2,5);
		System.out.println("strData1.substring(2,5)==>"+strData3);
	}
}
