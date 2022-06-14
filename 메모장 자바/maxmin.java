import java.util.Scanner;
public class maxmin{
	public static void main(String arags[]){
		int max=0;
		int min=0;

		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 데이타의 수 : ");
		int row = sc.nextInt();
		
		for(int i =1; i<=row; i++) {
			System.out.print(i+"번째 수 입력 : ");
			int value = sc.nextInt();
			
			if(i==1){
				max=value;
				min=value;
			}
			else if(value>max) max=value;
			else if(value<min) min=value;
		}
		System.out.println("================================");
		System.out.println("가장 큰 수 : "+max);
		System.out.println("가장 작은 수 : "+min);
		System.out.println("================================");
	}	
}