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
				tmpStr = br.readLine();//�����о tepstr�� �ֱ� ������ ������ null
				if (tmpStr != null) {
					csvStr += tmpStr + "\t";//�����ϱ� csvstr = kim dydtksrh 100 100 \t
				}
			} while (tmpStr != null);
			StringTokenizer parse = new StringTokenizer(csvStr, "\t"); //\t�� �������� ��ū�� ����
			int length = parse.countTokens() / 4; //��ü ��ū�� �? => 4��
			String[] name = new String[length]; //4���� �޸� ����
			String[] address = new String[length];
			double[] math = new double[length];
			double[] english = new double[length];
			double[] total = new double[length];
			double[] avg = new double[length];
			//�迭���� 4���� �������
			
			for (int i = 0; i < length; i++) {//0-4
				name[i] = parse.nextToken();	//ù��° ��ū�� name[i]�� ����, nexttoken���� ������ū ����Ŵ 
								
				address[i] = parse.nextToken();
				math[i] = Double.valueOf(parse.nextToken()).doubleValue();//����Ÿ���� ��üŸ���� �Ǽ��� �⺻������ �ٲ�
				
				english[i] = Double.valueOf(parse.nextToken()).doubleValue();
				total[i] = math[i] + english[i];
				avg[i] = total[i] / 2.0;
			}
			for (int j = 0; j < length; j++) {
				System.out.println(name[j] + "\t" + address[j] + "\t" + math[j] + "\t" + english[j] + "\t" + total[j]
						+ "\t" + avg[j]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� ���� �̸��� �Է��߽��ϴ�");
		}
	}
}




