import java.util.Scanner;
public class Time{
	public static void main(String args[]){
	int a;
	Scanner scan = new Scanner(System.in);
	System.out.print("�� �Է� : ");
	a =scan.nextInt();

	int c=a/3600;
	int b=(a-(c*3600))/60;
	//int d=a-((b*60)+(c*3600));
	int d=a%60;
	
	/* System.out.print(a);
	System.out.print("�ʴ�  ");
	System.out.print(c);
	System.out.print("�ð� ");

	System.out.print(b);
	System.out.print("�� ");

	System.out.print(d);
	System.out.println("���Դϴ�."); */

	System.out.println(a+"�ʴ� "+c+"�ð� "+b+"�� "+d+"���Դϴ�.");




	}
}