import java.util.Scanner;
public class qwerty{
public static void main(String args[]){
	System.out.print("����(1), ����(2), ��(3) �Է� : ");
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();

	if(a==1) System.out.println("����� ������ ���̽��ϴ�.");
	else if(a==2) System.out.println("����� ������ ���̽��ϴ�.");
	else if(a==3) System.out.println("����� ���� ���̽��ϴ�.");
	else System.out.println("�߸� ���̽��ϴ�.");

}
}