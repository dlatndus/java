import java.util.Scanner;
public class Scanner_1213{
	public static void main(String args[]){
		final int a;
		Scanner scan = new Scanner(System.in);
		System.out.print("�簢���� �ظ� : ");
		a =scan.nextInt();

		final int b;
		System.out.print("�簢���� ���� : ");
		b =scan.nextInt();
		
		System.out.print("�簢���� ���� : ");
		System.out.println(a*b);

	}
}