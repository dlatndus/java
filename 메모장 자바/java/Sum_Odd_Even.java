import java.util.Scanner;
public class Sum_Odd_Even{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int su = sc.nextInt();
		int even_sum = 0, odd_sum = 0;		

		for(int i=1; i<=su; i++){
			if(i%2==0) even_sum=even_sum+i;//¦��
			else odd_sum=odd_sum+i;//Ȧ��
		}
		System.out.println(even_sum);
		System.out.println(odd_sum);
	}
}