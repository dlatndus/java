package bytecode;

import java.io.IOException;

public class ReadFromSysExam {
	public static void main(String args[]) {
	
		byte[] b = new byte[1024];
		int len = 0;
		try {
			len = System.in.read(b);
			//배열 b에 입력한 데이터들을 저장하는데 입력한 데이터의
			//길이값을 리턴해서 len에 저장
			System.out.write(b, 0, len);
			//비열 b에 저장되어 있는 데이터를 0번째부터 시작하여
			//len 길이 만큼 출력해라
		}
		catch(IOException e) 
		{
			System.err.println("입력실패");
		}
	}
}

