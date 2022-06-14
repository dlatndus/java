package bytecode;

import java.io.IOException;

public class Echo2Exam {
	public static void main(String args[]) {
		int bt;
		
		try 
		{
			while((bt = System.in.read()) != -1)
			{
				//컨트롤 제트키를 동시에 누르면 -1값이 리턴된다
				//와일 문장이 false가 되기 때문에 종료
				//여기서는 여전히 한글처리 불가
				System.out.print((char)bt);
			}
		}
		
		catch(IOException e) 
		{
			System.err.println(e);
		}
	}
}
