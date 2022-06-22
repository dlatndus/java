package exception01;

import java.io.*;

public class NullPointerExam2 {
	public static void main(String[] args) {
		try {
		String str = null;
		System.out.println("문자열 : "+str.length());
		}
		catch(NullPointerException npe) {
			System.out.println(npe.toString());
		}
	}
}
