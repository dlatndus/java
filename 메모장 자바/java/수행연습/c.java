import java.util.Scanner;
public class c{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();


		int e = (a+b+c+d);
		double f =0.0;
		f= (e/4.0);
		
		char g;

		System.out.println("���� ���� : "+a);
		System.out.println("���� ���� : "+b);
		System.out.println("�ڹ� ���� : "+c);
		System.out.println("���� ���� : "+d);
		System.out.println("���� �հ� : "+e);
		System.out.println("���� ��� : "+f);
		
		if (f>=90) g='A';
		else if (f>=80) g='B';
		else g='c';
		
		System.out.println("���� : "+g);
		
	}
}