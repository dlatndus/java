package bytecode;

import java.io.IOException;

public class Echo1Exam {
	public static void main(String args[]) {
		int bt;
		
		try 
		{
			bt = System.in.read(); //1바이트 데이터를 입력
			//문자를 입력받을때 리턴값은 아스키코드 값
			System.out.println((char)bt);
			//bt 값을 문자로 형변환
		}
		
		catch(IOException e) 
		{
			System.err.println(e);
		}
	}
}
