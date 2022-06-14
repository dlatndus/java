package FileTestExam;

import java.io.*;

class sungDatasMain {
	public static void main(String[] args) {
		sungDatasExam wd = new sungDatasExam();
		try {
			wd.readingData("C:/Temp/writed.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
