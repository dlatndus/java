import java.util.Scanner;
public class Summer1213_7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("�ظ��� �������� �Է��Ͻÿ� : ");
		int m = sc.nextInt();
		System.out.print("���̸� �Է��Ͻÿ� : ");
		int h = sc.nextInt();		
		
	
		if(h>=100) System.out.println("���ڰ� �ʹ� Ů�ϴ�");
		else System.out.println(su(m, h)+"��");	
	}

	static int su(int m, int h){
		int a = (m*m*h)/3;
		return a;
	}
}