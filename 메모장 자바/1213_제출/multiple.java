import java.util.Scanner;
public class multiple{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("구할 배수 : ");
		int a=sc.nextInt();
		
		System.out.print("마지막 값 : ");
		int b=sc.nextInt();

		int sum = 0;
		int sum1=0;
		System.out.println("===================");
		System.out.print("1~"+b+"까지의 "+a+"의 배수 : ");
		for (int i=1; i<=b; i++){
			if((i*a)>b) break;	
			System.out.print(i*a+"   ");
			sum=sum+(i*a);
			sum1++;
		}
		System.out.println(" ");
		System.out.println("1~"+b+"까지의 "+a+"의 갯수 : "+sum1);
		System.out.println("1~"+b+"까지의 "+a+"의 합 : "+sum);
		System.out.println("===================");	

	}
}