package java_test;

import java.io.*;

public class WritingDatasMain2 {
	public static void main(String[] args) {
		make_sung_read wd = new make_sung_read();
		try {
			wd.readingData("C:/Temp/sung_read.txt");
			wd.writingData("C:/Temp/writinggg.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
