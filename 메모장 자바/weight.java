import java.util.Scanner;
public class weight {
	public static void main(String args[]){

		double sum=0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("5���� �����Ը� �Է��Ͻÿ�. ");
		for(int i =1; i<=5; i++) {
			double su = sc.nextDouble();
			sum=sum+su;
			}

		double avg = sum/5.0;

		System.out.println("�������� �� = " + sum);
		System.out.println("�������� ��� = " + avg);
	}
}