import java.util.Scanner;
public class MinOfThree{
public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("ù��° ���� �Է��Ͻÿ� : ");
	int a = sc.nextInt();
	System.out.print("�ι�° ���� �Է��Ͻÿ� : ");
	int b = sc.nextInt();
	System.out.print("����° ���� �Է��Ͻÿ� : ");
	int c = sc.nextInt();

	if (a>b){
	{
		if(b>c)
		{
		System.out.println(a +"�� " + b + "�� " + c + "�� ���� ���� ���� " + c + "�Դϴ�." );
		}
			else  
			{
			System.out.println(a + "�� " + b + "�� " + c + "�� ���� ���� ���� "+ b +"�Դϴ�.");				}
			}
	}
	else
	{
		if(a>c) 
		{
		System.out.println(a+"�� "+b+"�� "+c+ "�� ���� ���� ���� "+c+"�Դϴ�.");
		}
			else  
			{
			System.out.println(a + "�� " + b + "�� " + c + "�� ���� ���� ���� "+ a +"�Դϴ�.");
			}
	}
	
}
}