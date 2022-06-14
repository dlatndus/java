import java.util.Scanner;
public class star_1213{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("intput N -> ");
		int a=sc.nextInt();
		
		for(int i=1; i<=a; i++){
			for(int j=1; j<=a; j++)
				System.out.print("*");
					for (int l=a; l<=a; l++)
						System.out.print('A');
			System.out.println();
		}
	
	}
}