import java.util.Scanner;
public class Adsol{
	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int c = abs_no(a);
		System.out.println(c);

	}
	static int abs_no(int b){ //�޼��� ���� ��ȯ�ϴϱ� void �ȵ� Ÿ�ԶȰ������� int
		if(b<0) return -b; //����  abs_no(a)�� ������
		else return b;

	}
}
