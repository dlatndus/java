import java.util.Scanner;
public class CondOp_Test{
public static void main (String args[]){
	int a;
	Scanner scan = new Scanner(System.in);
	System.out.print("���� �Է� : ");
	a=scan.nextInt();

	
	String b="Ȧ��";
	String d="¦��";
	String e=(a%2==0)?d:b;
	
	System.out.print(a);
	System.out.print("��(��)");
	System.out.print(e);
	System.out.print("�Դϴ�.");

	System.out.print(a+"�Դϴ�.");
	}
}