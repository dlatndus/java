import java.util.Scanner;
public class Scanner_1213{
	public static void main(String args[]){
		final int a;
		Scanner scan = new Scanner(System.in);
		System.out.print("사각형의 밑면 : ");
		a =scan.nextInt();

		final int b;
		System.out.print("사각형의 높이 : ");
		b =scan.nextInt();
		
		System.out.print("사각형의 넓이 : ");
		System.out.println(a*b);

	}
}