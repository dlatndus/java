import java.util.Scanner;
public class Prime{
	public static void main (String args[]){
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt(); //3
		int count=0;
		for(int i = 1; i<=a; i++){ //i=1 1<=3 
			if (a%i==0) count++; //3%1
		}	
		if(count==2) System.out.println("소수입니다.");
		else System.out.println("소수가 아닙니다.");
	}
}