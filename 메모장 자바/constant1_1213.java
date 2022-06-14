import java.util.Scanner;
public class constant1_1213{
	public static void main(String args[]){
		int score;
		final int a=-85;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("시험점수 : ");		
		score =scan.nextInt();
		
		System.out.print(score);
		System.out.print(a+"=");
		System.out.println(score+a);

	}
}