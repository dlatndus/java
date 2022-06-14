import java.util.Scanner;
public class FlagSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		int a = sc.nextInt();
		int sum=0;
		int i;
		for (i =1; i<=a; i++){
			if (i % 2 == 0) 
			{
				sum -=i; 
				System.out.print("-" + i); 
			}	
			else if (i == 1)
			{
				sum +=i;
				 System.out.print(i); 
			}
			else
			{
				sum +=i;
				 System.out.print("+" + i); 
			}
			}
		

		System.out.println("="+sum);
	}
}