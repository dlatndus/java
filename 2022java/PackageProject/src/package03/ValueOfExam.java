package package03;

public class ValueOfExam {

	public static void main(String[] args) {
		String stri = "123456";
		String strd = "123.56";
		
		//stri가 가리키는 문자열을 정수형 숫자로 변경
		System.out.println(Integer.valueOf(stri));
		
		//strd가 가리키는 문자열을 실수형 숫자로 변경
		//따라서 valueOf()메소드는 문자열을 숫자로 변경한다
		System.out.println(Double.valueOf(strd));
		System.out.println(Integer.valueOf(stri) + Double.valueOf(strd));
	}

}
