import java.util.Scanner;
public class Summer1213_3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է��Ͻÿ� : ");
		int a = sc.nextInt();		
		
		for(int i=1; i<=a; i++){
			for(int j=1; j<=i; j++)
			System.out.print(i+"��");
		System.out.println();
		}
		
	}
}