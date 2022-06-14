import java.util.Scanner;
public class maxmin_1213{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 데이타의 수 : ");
		int a=sc.nextInt();
		int b=0;
		for(int i=1; i<=a; i++){
			System.out.print(i);
			b=sc.nextInt();
		}
		//int c=sc.nextInt();

		System.out.println(b);	
		
		System.out.println("가장 큰 수 : ");
		System.out.println("가장 작은 수 : ");
	}
}