import java.util.Scanner;
public class multiple{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��� : ");
		int a=sc.nextInt();
		
		System.out.print("������ �� : ");
		int b=sc.nextInt();

		int sum = 0;
		int sum1=0;
		System.out.println("===================");
		System.out.print("1~"+b+"������ "+a+"�� ��� : ");
		for (int i=1; i<=b; i++){
			if((i*a)>b) break;	
			System.out.print(i*a+"   ");
			sum=sum+(i*a);
			sum1++;
		}
		System.out.println(" ");
		System.out.println("1~"+b+"������ "+a+"�� ���� : "+sum1);
		System.out.println("1~"+b+"������ "+a+"�� �� : "+sum);
		System.out.println("===================");	

	}
}