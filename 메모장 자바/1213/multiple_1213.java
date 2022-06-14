import java.util.Scanner;
public class multiple_1213{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("구할 배수 : ");
		int a=sc.nextInt();
		
		System.out.print("마지막 값 : ");
		int b=sc.nextInt();
		int sum = 1;
		int sum1 = 1;
		System.out.println("===================");

		for(int i=1; b>=a; b--){
			if(b%a==0)System.out.print(b+"	");
				sum=sum+b;
				sum=sum+a;
		}
		System.out.println("1~"+b+"까지의 "+a+"의 배수 : ");
		System.out.println("1~"+b+"까지의 "+a+"의 갯수 : "+sum);
		System.out.println("1~"+b+"까지의 "+a+"의 합 : "+sum1);
		System.out.println("===================");

		

	}
}