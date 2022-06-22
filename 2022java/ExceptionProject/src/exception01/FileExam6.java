package exception01;

import java.io.*;

public class FileExam6 {

	public static void main(String[] args) {
		String[] irum = new String[3];
		int jumsu=99;
		int count = 10;
		int avg =0;
		
		try {
			avg = jumsu / count;
			for(int i=0; i<=irum.length; i++)
				System.out.println(irum[i]);
			
		}
		
		catch(ArithmeticException ae1) {//밑에 이거 써봤자 소용없음
			System.out.println("0으로 나누는 예외발생");
		}
		catch(ArrayIndexOutOfBoundsException ae2) {//그래서 오류발생
			System.out.println("배열의 범위 벗어난 예외발생");
		}
		catch(Exception e) {//모든예외를 여기에서 처리한다
			System.out.println("예외발생");
		}
		finally {//여기에서는 파일ㅇ르 닫는 문장(예, fis.close())
			System.out.println("무조건 실행합니다");
		}
	}
}
