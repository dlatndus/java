import java.util.Scanner;
public class WhileScore{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int sum=0;
		while(i<=i){ //while(true)�ص���
			System.out.print("������ �Է��Ͻÿ� :  ");
			int a = sc.nextInt();
			if(a==0) break;
			sum = sum+a;
			i++;
		}
		System.out.println("������ �� = "+sum);
		System.out.println("������ ��� = "+(double)(sum/i));
	}
}