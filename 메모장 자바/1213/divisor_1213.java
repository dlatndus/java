import java.util.Scanner;
public class divisor_1213{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("약수를 구할 수 입력 : ");
		int a=sc.nextInt();

		int sum=0;
		System.out.print(a+"의 약수 : ");
		for(int i=1; i<=a; i++){
			if(a%i==0) System.out.print(i+" ");
			
		}
		System.out.println();

		

	}
}