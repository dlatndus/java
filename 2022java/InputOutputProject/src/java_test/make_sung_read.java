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
		// �迭�� �������� ���� �о���� �����͸� �����Ѵ�.
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
			StringTokenizer parse = new StringTokenizer(csvStr, "\t"); //������ ������ �ϰٴ�
			length = parse.countTokens() / 5; //���� ������ ���� �����°� �ٲٱ�
			
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
				System.out.print("��Ż : " + total[i] + "\t");

			}
			System.out.println();
			for (int i = 0; i < length; i++) {

				System.out.print("��� : " + avg[i]+ "\t");

			}
			System.out.println();
			for (int i = 0; i < length; i++) {

				System.out.print("���� : " + grade[i]+ "\t");
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

				System.out.print("��� : " + result[i]+ "\t");
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
			System.out.println("�߸��� ���� �̸��� �Է��߽��ϴ�");
		}
	}
	
	public void writingData(String fname) throws IOException {
		// String fname = "C:/Temp/writing.txt"
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(new File(fname));
			// fw�� "writing.txt"������ ����Ű�� ��ü�����̴�.
			bw = new BufferedWriter(fw);
			// bw�� fw�� ��Ű�� ������ ����Ű��, ���۶�� Ŭ������ �߰��Ͽ� ����Ѵ�.
			
			bw.write("�й�	�̸�	����	����	����	����	���	����	���");
			bw.newLine();
			bw.write("=====================================================================================");
			bw.newLine();
			
			for (int j = 0; j < length; j++) {
				bw.write(snum[j] + "\t" + name[j] + "\t" + kor[j] + "\t" + math[j] + "\t" + english[j] 
						+ "\t" + total[j] + "\t" + avg[j] + "\t" + grade[j] + "\t" + result[j] + "\t");
				// bw�� ����Ű�� ���� "writing.txt"�� ����Ѵ�.
				bw.newLine(); // BufferedWriterŬ������ newLine()�޼ҵ带 ������ �ִ�.  
				// newLine()�� �ٹٲ�
			}
			bw.close();
			fw.close();
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� ���� �̸��� �Է��߽��ϴ�");
		}
	}

	
	
}
	

