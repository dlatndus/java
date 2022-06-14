package FileTestExam;

import java.io.*;
import java.util.*;

public class sungDatasExam {

	public void readingData(String fname) throws IOException {
		try {
			FileReader fr = new FileReader(new File(fname));
			BufferedReader br = new BufferedReader(fr);
			String csvStr = "";
			String tmpStr = "";
			do {
				tmpStr = br.readLine();//한줄읽어서 tepstr에 넣기 읽을거 없으면 null
				if (tmpStr != null) {
					csvStr += tmpStr + "\t";//구분하기 csvstr = kim dydtksrh 100 100 \t
				}
			} while (tmpStr != null);
			StringTokenizer parse = new StringTokenizer(csvStr, "\t"); //\t를 기준으로 토큰을 생성
			int length = parse.countTokens() / 4; //전체 토큰은 몇개? => 4개
			String[] name = new String[length]; //4개의 메모리 생성
			String[] address = new String[length];
			double[] math = new double[length];
			double[] english = new double[length];
			double[] total = new double[length];
			double[] avg = new double[length];
			//배열공간 4개가 만들어짐
			
			for (int i = 0; i < length; i++) {//0-4
				name[i] = parse.nextToken();	//첫번째 토큰을 name[i]에 저장, nexttoken으로 다음토큰 가르킴 
								
				address[i] = parse.nextToken();
				math[i] = Double.valueOf(parse.nextToken()).doubleValue();//문자타입을 객체타입의 실수형 기본형으로 바꿈
				
				english[i] = Double.valueOf(parse.nextToken()).doubleValue();
				total[i] = math[i] + english[i];
				avg[i] = total[i] / 2.0;
			}
			for (int j = 0; j < length; j++) {
				System.out.println(name[j] + "\t" + address[j] + "\t" + math[j] + "\t" + english[j] + "\t" + total[j]
						+ "\t" + avg[j]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
	}
}




