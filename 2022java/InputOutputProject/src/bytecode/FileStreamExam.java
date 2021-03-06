package bytecode;

import java.io.*;

public class FileStreamExam {

	public static void main(String[] args) throws IOException{
		byte[] b = new byte[1024];
		FileInputStream fis = new FileInputStream("C:/Temp/tin.txt");//절대경로
		//fis는 "tin.txt" 파일을 가리키는 객체변수
		FileOutputStream fos = new FileOutputStream("C:/Temp/tout.txt");
		//fos는"tout.txt" 파일을 가리키는 객체변수
		fis.read(b);
		//fis가 가리키는 tin.txt"파일에서 데이터를 읽어서 배열 b에 저장
		fos.write(b);
		//배열b에 저장되어있는 데이터를 fos가 가리키는 "tout.txt"파일에 출력한다
		fos.close();
		//파일을 닫아준다 fis객체변수는 더이상 "tin.txt"파일을 사용하지 않겠다
		fis.close();
		//파일을 닫을때는 객체생성순서의 역순으로 닫는단
	}

}
