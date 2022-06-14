import java.util.Scanner;
public class weight_1213{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("5명의 몸무게를 입력하시오. ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		double e=sc.nextDouble();

		double f = a+b+c+d+e;

		double g = f/5;

		System.out.println("몸무게의 합 = " + f);
		System.out.println("몸무게의 평균 = " + g);

		

		

	}
}