package exception01;

import java.io.*;

public class FileExam4 {

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
		catch(ArithmeticException ae1) {//count가 0일때 ae1이 실행된다
			System.out.println("0으로 나누는 예외발생");
		}
		catch(ArrayIndexOutOfBoundsException ae2) {//irum[3]일때
			System.out.println("배열의 범위 벗어난 예외발생");
		}
		catch(Exception e) {//위의 2가지 예외가 아닌경우 실행
			System.out.println("예외발생");
		}

	}
}
