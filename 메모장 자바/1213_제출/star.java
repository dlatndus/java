import java.util.Scanner;
public class star{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("input N -> ");
		int row = sc.nextInt();
		for(int i =1; i<=row; i++) {
			for(int j =1; j<=row; j++)
				if(i==j)System.out.print((char)(64+i));
				else System.out.print("*");
		System.out.println();
		}
	}	
}