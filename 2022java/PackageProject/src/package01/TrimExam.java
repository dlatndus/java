package package01;

public class TrimExam {

	public static void main(String[] args) {
		String strData1 = "  	I Love You  	";//문자열
		String strData2;
		
		//strData1이 가르키는 문자열에서 앞 뒤의 공백을 제거
		strData2 = strData1.trim();
		System.out.println("strData2.trim() ==>" + strData2);
		
		if(strData1.equals(strData2))
			System.out.println("같음");
		else
			System.out.println("다름");

	}

}