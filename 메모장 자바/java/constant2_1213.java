import java.util.Scanner;
public class constant2_1213{
	public static void main(String args[]){
		int r;
		final double pi=3.14;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ : ");		
		r =scan.nextInt();
		
		System.out.println(r);

		System.out.print("������ ");
		System.out.print(r);
		System.out.print("�� ���� �ѷ� : ");
		System.out.println(2*r*pi);

		System.out.print("������ ");
		System.out.print(r);
		System.out.print("�� ���� ���� : ");
		System.out.println(pi*r*r);

	}
}