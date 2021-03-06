package java_test;

import java.io.*;
import java.util.*;

public class make_sung_read {

	int length;
	String[] snum = new String[10];
	String[] name = new String[10];
	double[] kor = new double[10];
	double[] math = new double[10];
	double[] english = new double[10];
	double[] total = new double[10];
	double[] avg = new double[10];
	String[] grade = new String[10];
	int[] result = new int[10];
	
	
	public void readingData(String fname) throws IOException {
		// String fname = "C:/Temp/writed.txt"
		// 배열에 파일으로 부터 읽어들인 데이터를 저장한다.
		try {
			String csvStr = "";
			String tmpStr = "";
			FileReader fr = new FileReader(new File(fname));
			BufferedReader br = new BufferedReader(fr);
			do {
				tmpStr = br.readLine();
				if (tmpStr != null) {
					csvStr += tmpStr + "\t";
				}
			} while (tmpStr != null);
			StringTokenizer parse = new StringTokenizer(csvStr, "\t"); //탭으로 구분을 하겟다
			length = parse.countTokens() / 5; //가로 갯수에 따라 나누는거 바꾸기
			
			for (int i = 0; i < length; i++) {
				snum[i] = parse.nextToken();
				name[i] = parse.nextToken();
				kor[i] = Double.valueOf(parse.nextToken()).doubleValue();
				math[i] = Double.valueOf(parse.nextToken()).doubleValue();
				english[i] = Double.valueOf(parse.nextToken()).doubleValue();
				total[i] = math[i] + english[i] + kor[i];
				avg[i] = (Math.round((total[i] / 3.0)*10))/10.0;
			}

			
			for (int i = 0; i < length; i++) {
				if(avg[i]>=90)
					grade[i] = "A";
				
				else if(avg[i]>=80 && avg[i]<=89)
					grade[i] = "B";
				
				else if(avg[i]>=70 && avg[i]<=79)
					grade[i] = "C";
				
				else if(avg[i]>=60 && avg[i]<=69)
					grade[i] = "D";
				
				else
					grade[i] = "E";
			}
			
			for (int i = 0; i < length; i++) {
				System.out.print("토탈 : " + total[i] + "\t");

			}
			System.out.println();
			for (int i = 0; i < length; i++) {

				System.out.print("평균 : " + avg[i]+ "\t");

			}
			System.out.println();
			for (int i = 0; i < length; i++) {

				System.out.print("학점 : " + grade[i]+ "\t");
			}
			System.out.println();
			
			
			/*
			for (int i = 0; i < length-1; i++) {
				for(int j =0; j<i; j++) {
					if(st[j] > st[j+1]) {
						int temp = (int) st[j];
						st[j] = st[j+1];
						st[j+1] = temp;
					}
				}
			}
			
			*/
			
			
			
			
			for(int i =0; i<length; i++) {
				int cnt =1;
				for(int j=0; j<length; j++) {
					if(avg[i]<avg[j]) 
						cnt++;
						
					result[i] = cnt;
				}
			}
			
			System.out.println();
			for (int i = 0; i < length; i++) {

				System.out.print("등수 : " + result[i]+ "\t");
			}
			/*
			
			int a=1;
			for (int i = 0; i < length; i++) {
				for(int j=0; j<length; j++) {
					if(st[i]==avg[i])
						st1[j]=a++;
				}
			}
			
			System.out.println();
			for (int i = 0; i < length; i++) {

				System.out.print(avg[i] +" => " + (int)st1[i]+ "\t");
			}
			
			*/
			
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
	}
	
	public void writingData(String fname) throws IOException {
		// String fname = "C:/Temp/writing.txt"
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(new File(fname));
			// fw는 "writing.txt"파일을 가리키는 객체변수이다.
			bw = new BufferedWriter(fw);
			// bw는 fw가 라리키는 파일을 가리키며, 버퍼라는 클래스를 추가하여 사용한다.
			
			bw.write("학번	이름	국어	영어	수학	총점	평균	학점	등수");
			bw.newLine();
			bw.write("=====================================================================================");
			bw.newLine();
			
			for (int j = 0; j < length; j++) {
				bw.write(snum[j] + "\t" + name[j] + "\t" + kor[j] + "\t" + math[j] + "\t" + english[j] 
						+ "\t" + total[j] + "\t" + avg[j] + "\t" + grade[j] + "\t" + result[j] + "\t");
				// bw가 가리키는 파일 "writing.txt"에 출력한다.
				bw.newLine(); // BufferedWriter클래스는 newLine()메소드를 가지고 있다.  
				// newLine()는 줄바꿈
			}
			bw.close();
			fw.close();
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
	}

	
	
}
	


