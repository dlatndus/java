import java.util.Scanner;
public class Fruit_1213_5{
	public static void main(String args[]){

	Scanner scan = new Scanner(System.in);
	System.out.println("������ ������ ������ �Է��ϼ���.");
	System.out.print("��� ���� ������ ���� : ");
	int a=scan.nextInt();
	int c=scan.nextInt();
	int o=scan.nextInt();
	int g=scan.nextInt();

	int b=(a*1200)+(c*950)+(o*500)+(g*2000);
	
	System.out.println("");
	System.out.println("�� ���ұݾ��� "+b+"���Դϴ�.");
	System.out.println("");

	System.out.print("���ޱݾ� : ");
	int d=scan.nextInt();

	String q=(d + "���� �޾� �Ž������� "+(d-b)+"���Դϴ�.");
	String w=(d + "���� �޾� �ݾ��� �����մϴ�.");
	
	String e = (b<=d) ? q : w ;
	System.out.println(e);
	}
}