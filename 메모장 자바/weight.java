import java.util.Scanner;
public class weight {
	public static void main(String args[]){

		double sum=0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("5명의 몸무게를 입력하시오. ");
		for(int i =1; i<=5; i++) {
			double su = sc.nextDouble();
			sum=sum+su;
			}

		double avg = sum/5.0;

		System.out.println("몸무게의 합 = " + sum);
		System.out.println("몸무게의 평균 = " + avg);
	}
}