import java.util.Scanner;
public class constant2_1213{
	public static void main(String args[]){
		int r;
		final double pi=3.14;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름 : ");		
		r =scan.nextInt();
		
		System.out.println(r);

		System.out.print("반지름 ");
		System.out.print(r);
		System.out.print("인 원의 둘레 : ");
		System.out.println(2*r*pi);

		System.out.print("반지름 ");
		System.out.print(r);
		System.out.print("인 원의 넓이 : ");
		System.out.println(pi*r*r);

	}
}