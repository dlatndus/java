import java.util.Scanner;
public class Summer1213_2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		char key = sc.next().charAt(0);		
		
		if (key=='w')
			System.out.println("������ ��ĭ");
		else if (key=='a')
			System.out.println("�������� ��ĭ");
		else if (key=='s')
			System.out.println("�ڷ� ��ĭ");
		else if (key=='d')
			System.out.println("���������� ��ĭ");
		else
			System.out.println("�߸� �����̽��ϴ�");
		
	}
}