import java.util.Scanner;
public class multiple_1213{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��� : ");
		int a=sc.nextInt();
		
		System.out.print("������ �� : ");
		int b=sc.nextInt();
		int sum = 1;
		int sum1 = 1;
		System.out.println("===================");

		for(int i=1; b>=a; b--){
			if(b%a==0)System.out.print(b+"	");
				sum=sum+b;
				sum=sum+a;
		}
		System.out.println("1~"+b+"������ "+a+"�� ��� : ");
		System.out.println("1~"+b+"������ "+a+"�� ���� : "+sum);
		System.out.println("1~"+b+"������ "+a+"�� �� : "+sum1);
		System.out.println("===================");

		

	}
}