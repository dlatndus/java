import java.util.Scanner;
public class maxmin{
	public static void main(String arags[]){
		int max=0;
		int min=0;

		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��� ����Ÿ�� �� : ");
		int row = sc.nextInt();
		
		for(int i =1; i<=row; i++) {
			System.out.print(i+"��° �� �Է� : ");
			int value = sc.nextInt();
			
			if(i==1){
				max=value;
				min=value;
			}
			else if(value>max) max=value;
			else if(value<min) min=value;
		}
		System.out.println("================================");
		System.out.println("���� ū �� : "+max);
		System.out.println("���� ���� �� : "+min);
		System.out.println("================================");
	}	
}